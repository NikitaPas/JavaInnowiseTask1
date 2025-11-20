package org.pasnikita.service;

import org.pasnikita.entity.CustomArray;
import org.pasnikita.exception.ArrayException;

public interface ArraySort {
  CustomArray bubbleSort(CustomArray customArray) throws ArrayException;
  CustomArray selectionSort(CustomArray customArray) throws ArrayException;
}
