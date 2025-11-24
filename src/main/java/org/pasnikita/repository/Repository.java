package org.pasnikita.repository;

import org.pasnikita.entity.CustomArray;

import java.util.List;

public class Repository {

  private List<CustomArray> arrayList;

  public Repository(List<CustomArray> arrayList) {
    this.arrayList = arrayList;
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

//  public List<CustomArray> query(Specification specification){
//
//  }
}
