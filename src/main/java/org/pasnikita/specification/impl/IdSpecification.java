package org.pasnikita.specification.impl;

import org.pasnikita.entity.CustomArray;
import org.pasnikita.specification.Specification;

public class IdSpecification implements Specification {

  private int id;

  public IdSpecification(int id) {
    this.id = id;
  }

  @Override
  public boolean specify(CustomArray customArray) {
    return customArray.getId() == id;
  }

}
