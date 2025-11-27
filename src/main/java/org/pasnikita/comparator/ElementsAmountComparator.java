package org.pasnikita.comparator;

import org.pasnikita.entity.CustomArray;

import java.util.Comparator;

public class ElementsAmountComparator implements Comparator<CustomArray> {

  @Override
  public int compare(CustomArray o1, CustomArray o2) {
    return o1.getValues().length - o2.getValues().length;
  }
}
