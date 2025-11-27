package org.pasnikita.specification.impl;

import org.pasnikita.entity.CustomArray;
import org.pasnikita.exception.ArrayException;
import org.pasnikita.service.ArrayCalculator;
import org.pasnikita.service.impl.ArrayCalculatorImpl;
import org.pasnikita.specification.Specification;

public class SumGreaterSpecification implements Specification {
  private ArrayCalculator arrayCalculator = new ArrayCalculatorImpl();
  private int sum;

  public SumGreaterSpecification(int sum) {
    this.sum = sum;
  }

  @Override
  public boolean specify(CustomArray customArray) {
    int result = 0;

    result = arrayCalculator.calcSum(customArray);
    return result >= sum;
  }
}
