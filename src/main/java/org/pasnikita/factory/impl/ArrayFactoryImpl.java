package org.pasnikita.factory.impl;

import org.pasnikita.entity.CustomArray;
import org.pasnikita.exception.ArrayException;
import org.pasnikita.factory.ArrayFactory;

public class ArrayFactoryImpl implements ArrayFactory {

  private static int counter = 1;

  @Override
  public CustomArray createArray(int[] array) throws ArrayException {
    if (array == null || array.length == 0) {
      throw new ArrayException("Array cannot be empty");
    }
    return new CustomArray(counter++, array);
  }
}
