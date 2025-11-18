package org.pasnikita.validator.impl;

import org.pasnikita.validator.LineValidator;

public class LineValidatorImpl implements LineValidator {
  public static final String VALID_PATTERN = "^[\\d\\s\\p{P}]+$";

  @Override
  public boolean isValid(String line) {
    return line != null && line.matches(VALID_PATTERN);
  }
}
