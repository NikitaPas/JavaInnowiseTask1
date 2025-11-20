package org.pasnikita.factory;

import org.pasnikita.entity.CustomArray;
import org.pasnikita.exception.ArrayException;

public interface ArrayFactory {

  CustomArray createArray(int[] array) throws ArrayException;

}
