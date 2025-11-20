package org.pasnikita.parser.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.pasnikita.exception.ArrayException;
import org.pasnikita.parser.ArrayParser;

import java.util.Arrays;

public class ArrayParserImpl implements ArrayParser {
  public static final Logger LOGGER = LogManager.getLogger();
  private static final String DELIMITER_REGEX = "[\\p{P}\\s]+";

  @Override
  public int[] parseLine(String line) throws ArrayException {

    try {
      return Arrays.stream(line.trim().split(DELIMITER_REGEX))
              .mapToInt(Integer::parseInt)
              .toArray();
    } catch (NumberFormatException e) {
      LOGGER.error("Invalid number in line", e);
      throw new ArrayException("Invalid number in line: " + line, e);
    }
  }
}
