package org.pasnikita.factory.impl;

import org.pasnikita.entity.ArrayUtils;
import org.pasnikita.exception.ArrayException;
import org.pasnikita.factory.ArrayFactory;

public class ArrayFactoryImpl implements ArrayFactory {

  private static int counter = 1;

  @Override
  public ArrayUtils createArray(int[] array) throws ArrayException {
    if (array == null || array.length == 0) {
      throw new ArrayException("Array cannot be empty");
    }
    return new ArrayUtils(counter++, array);
  }
}
