package org.pasnikita.factory;

import org.pasnikita.entity.ArrayUtils;
import org.pasnikita.exception.ArrayException;

public interface ArrayFactory {

  ArrayUtils createArray(int[] array) throws ArrayException;

}
