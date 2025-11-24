package org.pasnikita.specification.impl;

import org.pasnikita.entity.CustomArray;
import org.pasnikita.specification.Specification;

public class SumSpecification implements Specification {

  private int sum;

  public SumSpecification(int sum) {
    this.sum = sum;
  }

  @Override
  public boolean specify(CustomArray customArray) {

    int result = 0;
    int[] array = customArray.getValues();

    for(int i = 0; i < array.length; i++){
      result += array[i];
    }
    return result >= sum;
  }
}
