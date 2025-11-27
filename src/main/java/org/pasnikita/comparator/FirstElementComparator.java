package org.pasnikita.comparator;

import org.pasnikita.entity.CustomArray;

import java.util.Comparator;

public class FirstElementComparator implements Comparator<CustomArray> {

  @Override
    public int compare(CustomArray o1, CustomArray o2) {
      int[] first = o1.getValues();
      int[] second = o2.getValues();

      return first[0] - second[0];
  }
}
