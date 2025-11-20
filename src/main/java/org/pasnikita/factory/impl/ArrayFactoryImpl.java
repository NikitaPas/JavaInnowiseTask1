package org.pasnikita.factory.impl;

import org.pasnikita.entity.CustomArray;
import org.pasnikita.exception.ArrayException;
import org.pasnikita.factory.ArrayFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayFactoryImpl implements ArrayFactory {
  public static final Logger LOGGER = LogManager.getLogger();
  private static int counter = 1;

  @Override
  public CustomArray createArray(int[] array) throws ArrayException {
    return new CustomArray(counter++, array);
  }
}
