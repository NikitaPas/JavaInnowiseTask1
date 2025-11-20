package service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.pasnikita.entity.CustomArray;
import org.pasnikita.exception.ArrayException;
import org.pasnikita.service.ArraySort;
import org.pasnikita.service.impl.ArraySortImpl;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArraySortTest {
  private ArraySort arraySort;
  private CustomArray customArray;

  @BeforeEach
  void setUp() {
    arraySort = new ArraySortImpl();
    customArray = new CustomArray(0, new int[]{9, 5, 2, 10, 4, 3});
  }

  @AfterEach
  void tearDown() {
    arraySort = null;
    customArray = null;
  }

  @Test
  void testBubbleSort() throws ArrayException {
    CustomArray actual = arraySort.bubbleSort(customArray);
    int[] expected = new int[]{2, 3, 4, 5, 9, 10};
    assertArrayEquals(expected, actual.getValues());
  }

  @Test
  void testSelectionSort() throws ArrayException {
    CustomArray actual = arraySort.selectionSort(customArray);
    int[] expected = new int[]{2, 3, 4, 5, 9, 10};
    assertArrayEquals(expected, actual.getValues());
  }
}
