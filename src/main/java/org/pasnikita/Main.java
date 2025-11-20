package org.pasnikita;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.util.ArrayUtils;
import org.pasnikita.entity.CustomArray;
import org.pasnikita.exception.ArrayException;
import org.pasnikita.factory.ArrayFactory;
import org.pasnikita.factory.impl.ArrayFactoryImpl;
import org.pasnikita.parser.ArrayParser;
import org.pasnikita.parser.impl.ArrayParserImpl;
import org.pasnikita.reader.FileReader;
import org.pasnikita.reader.impl.FileReaderImpl;
import org.pasnikita.validator.LineValidator;
import org.pasnikita.validator.impl.LineValidatorImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {

  private static final Logger LOGGER = LogManager.getLogger();

  public static void main(String[] args) {

    String filePath = "src/data/data.txt";

    FileReader fileReader = new FileReaderImpl();
    LineValidator validator = new LineValidatorImpl();
    ArrayParser parser = new ArrayParserImpl();
    ArrayFactory factory = new ArrayFactoryImpl();

    List<CustomArray> arrays = new ArrayList<>();
    try {
      List<String> lines = fileReader.read(filePath);
      LOGGER.info("File read successfully. Total lines: " + lines.size());

      for (String line : lines) {

        if (line == null || line.isBlank()) {
          LOGGER.warn("Skipping empty line");
          continue;
        }

        if (!validator.isValid(line)) {
          LOGGER.warn("Invalid line skipped: [" + line + "]");
          continue;
        }

        try {
          int[] numbers = parser.parseLine(line);
          CustomArray array = factory.createArray(numbers);
          arrays.add(array);
          LOGGER.info("Created array: " + array);

        } catch (ArrayException e) {
          LOGGER.error("Error processing line [" + line + "]: " + e.getMessage());
        }
      }

    } catch (ArrayException e) {
      LOGGER.fatal("Cannot finish program: " + e.getMessage());
      return;
    }

    System.out.println("=== Result Arrays ===");
    arrays.forEach(System.out::println);
  }
}