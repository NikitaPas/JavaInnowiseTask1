package org.pasnikita.parser.impl;

import org.pasnikita.exception.ArrayException;
import org.pasnikita.parser.ArrayParser;

import java.util.Arrays;

public class ArrayParserImpl implements ArrayParser {

  private static final String DELIMITER_REGEX = "[\\p{P}\\s]+";

  @Override
  public int[] parseLine(String line) throws ArrayException {

    if (line == null) {
      throw new ArrayException("Line cannot be null");
    }

    try {
      return Arrays.stream(line.trim().split(DELIMITER_REGEX))
              .mapToInt(Integer::parseInt)
              .toArray();
    } catch (NumberFormatException e) {
      throw new ArrayException("Invalid number in line: " + line, e);
    }
  }
}
