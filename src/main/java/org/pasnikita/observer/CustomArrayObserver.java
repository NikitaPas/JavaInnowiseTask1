package org.pasnikita.observer;

import org.pasnikita.entity.CustomArray;
import org.pasnikita.warehouse.Warehouse;

import java.util.IntSummaryStatistics;

public class CustomArrayObserver {
  public void update(CustomArrayEvent customArrayEvent) {
    CustomArray customArray = customArrayEvent.getSource();
    Warehouse warehouse = Warehouse.getInstance();
    IntSummaryStatistics stats = new IntSummaryStatistics();
    int[] array = customArray.getValues();

    for(int value : array){
      stats.accept(value);
    }
    warehouse.put(customArray.getId(), stats);
  }
}
