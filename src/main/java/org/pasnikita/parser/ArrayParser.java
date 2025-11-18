package org.pasnikita.parser;

import org.pasnikita.exception.ArrayException;

public interface ArrayParser {
  int[] parseLine(String line) throws ArrayException;
}
