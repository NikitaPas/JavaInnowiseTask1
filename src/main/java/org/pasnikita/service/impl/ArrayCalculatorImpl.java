package org.pasnikita.service.impl;

import org.pasnikita.entity.CustomArray;
import org.pasnikita.exception.ArrayException;
import org.pasnikita.service.ArrayCalculator;

public class ArrayCalculatorImpl implements ArrayCalculator {

  @Override
  public int calcSum(CustomArray customArray) {

    int[] array = customArray.getValues();
    int resultSum = 0;

    for (int i : array) {
      resultSum += i;
    }

    return resultSum;
  }
}
