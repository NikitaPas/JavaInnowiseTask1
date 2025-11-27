package org.pasnikita.repository;

import org.pasnikita.entity.CustomArray;
import org.pasnikita.observer.CustomArrayEvent;
import org.pasnikita.observer.CustomArrayObservable;
import org.pasnikita.observer.CustomArrayObserver;
import org.pasnikita.specification.Specification;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Repository {
  private List<CustomArray> arrayList;
  private static Repository instance;

  public static Repository getInstance() {
    if (instance == null) {
      instance = new Repository();
    }
    return instance;
  }

  public boolean add(CustomArray customArray) {
    return arrayList.add(customArray);
  }

  public void add(int index, CustomArray element) {
    arrayList.add(index, element);
  }

  public boolean remove(CustomArray o) {
    return arrayList.remove(o);
  }

  public CustomArray get(int id) {
    return arrayList.get(id);
  }

  public CustomArray set(int id, CustomArray element) {
    return arrayList.set(id, element);
  }

  public CustomArray remove(int index) {
    return arrayList.remove(index);
  }

  public List<CustomArray> sort(Comparator<? super CustomArray> comparator) {
    return arrayList.stream()
            .sorted(comparator)
            .toList();
  }

  public List<CustomArray> query(Specification specification) {
    List<CustomArray> result = new ArrayList<>();

    for (CustomArray customArray : arrayList) {
      if (specification.specify(customArray)) {
        result.add(customArray);
      }
    }

    return result;
  }
}
