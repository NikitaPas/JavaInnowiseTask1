package org.pasnikita.service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.pasnikita.entity.CustomArray;
import org.pasnikita.exception.ArrayException;
import org.pasnikita.service.ArraySearch;

public class ArraySearchImpl implements ArraySearch {
  private static final Logger LOGGER = LogManager.getLogger();

  @Override
  public int findMax(CustomArray customArray) throws ArrayException {

    if(customArray == null){
      LOGGER.error("CustomArray is null");
      throw new ArrayException("CustomArray is null");
    }

    int[] array = customArray.getValues();

    int max = array[0];

    for(int value : array){
      if(value > max){
        max = value;
      }
    }

    return max;
  }

  @Override
  public int findMin(CustomArray customArray) throws ArrayException {

    if(customArray == null){
      LOGGER.error("CustomArray is null");
      throw new ArrayException("CustomArray is null");
    }

    int[] array = customArray.getValues();

    int min = array[0];

    for(int value : array){
      if(value < min){
        min = value;
      }
    }

    return min;

  }
}
