package org.pasnikita.service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.pasnikita.entity.CustomArray;
import org.pasnikita.exception.ArrayException;
import org.pasnikita.service.ArraySort;

import java.util.Arrays;

public class ArraySortImpl implements ArraySort {

  private static final Logger LOGGER = LogManager.getLogger(ArraySearchImpl.class);

  @Override
  public CustomArray bubbleSort(CustomArray customArray) throws ArrayException {

    if (customArray == null) {
      LOGGER.error("bubbleSort(): CustomArray is null");
      throw new ArrayException("CustomArray is null");
    }

    int[] array = customArray.getValues();

    for (int i = 0; i < array.length - 1; i++) {
      for (int j = 0; j < array.length - 1 - i; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }

    LOGGER.info("bubbleSort(): Sorted array for id={} → {}", customArray.getId(), Arrays.toString(array));


    return new CustomArray(customArray.getId(),  array);
  }

  @Override
  public CustomArray selectionSort(CustomArray customArray) throws ArrayException {

    if (customArray == null) {
      LOGGER.error("selectionSort(): CustomArray is null");
      throw new ArrayException("CustomArray is null");
    }

    int[] array = customArray.getValues();

    for (int i = 0; i < array.length - 1; i++) {
      int minIndex = i;

      for (int j = i + 1; j < array.length; j++) {
        if (array[j] < array[minIndex]) {
          minIndex = j;
        }
      }

      // Swap
      int temp = array[i];
      array[i] = array[minIndex];
      array[minIndex] = temp;
    }

    LOGGER.info("selectionSort(): Sorted array for id={} → {}",
            customArray.getId(), Arrays.toString(array));

    return new CustomArray(customArray.getId(), array);
  }
}
