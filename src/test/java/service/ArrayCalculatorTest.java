package service;

import org.junit.jupiter.api.*;
import org.pasnikita.entity.CustomArray;
import org.pasnikita.exception.ArrayException;
import org.pasnikita.service.ArrayCalculator;
import org.pasnikita.service.impl.ArrayCalculatorImpl;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayCalculatorTest {

  private ArrayCalculator arrayCalculator;
  private CustomArray customArray;

  @BeforeEach
  void setUp() {
    arrayCalculator = new ArrayCalculatorImpl();
    customArray = new CustomArray(0, new int[]{1, 2, 3});
  }

  @AfterEach
  void tearDown() {
    customArray = null;
    arrayCalculator = null;
  }

  @Test
  void testCalculatorSum() throws ArrayException {

    int actual = arrayCalculator.calcSum(customArray);
    assertEquals(6, actual);

  }

}
