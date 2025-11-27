package org.pasnikita.warehouse;

import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.Map;

public class Warehouse {
  private static Warehouse instance;
  private Map<Integer, IntSummaryStatistics> statisticsMap = new HashMap<>();

  private Warehouse() {
  }

  public static Warehouse getInstance() {
    if (instance == null) {
      instance = new Warehouse();
    }
    return instance;
  }

  public IntSummaryStatistics get(int id){
    return statisticsMap.get(id);
  }

  public IntSummaryStatistics put(int id, IntSummaryStatistics stats){
    return statisticsMap.put(id, stats);
  }




}
