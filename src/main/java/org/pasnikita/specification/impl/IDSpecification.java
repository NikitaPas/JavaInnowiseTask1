package org.pasnikita.specification.impl;

import org.pasnikita.entity.CustomArray;
import org.pasnikita.specification.Specification;

public class IDSpecification implements Specification {

  private int id;

  public IDSpecification(int id) {
    this.id = id;
  }

  @Override
  public boolean specify(CustomArray customArray) {
    return customArray.getId() == id;
  }

}
