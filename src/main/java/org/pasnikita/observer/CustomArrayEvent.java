package org.pasnikita.observer;

import org.pasnikita.entity.CustomArray;

import java.util.EventObject;

public class CustomArrayEvent extends EventObject {

  public CustomArrayEvent(CustomArray source) {
    super(source);
  }

  @Override
  public CustomArray getSource() {
    return (CustomArray) super.getSource();
  }
}
