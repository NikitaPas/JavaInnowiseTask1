package org.pasnikita.service;

import org.pasnikita.entity.CustomArray;
import org.pasnikita.exception.ArrayException;

public interface ArraySearch {
  int findMax(CustomArray customArray) throws ArrayException;
  int findMin(CustomArray customArray) throws ArrayException;
}
