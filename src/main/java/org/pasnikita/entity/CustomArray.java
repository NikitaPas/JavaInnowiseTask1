package org.pasnikita.entity;

import org.pasnikita.observer.CustomArrayEvent;
import org.pasnikita.observer.CustomArrayObservable;
import org.pasnikita.observer.CustomArrayObserver;

import java.util.Arrays;

public class CustomArray implements CustomArrayObservable {
  private int id;
  private int[] values;
  private CustomArrayObserver observer;

  public CustomArray(int id, int[] values) {
    this.id = id;
    this.values = Arrays.copyOf(values, values.length);
    notifyObserver();
  }

  public int getId() {
    return id;
  }

  public int[] getValues() {
    return Arrays.copyOf(values, values.length);
  }

  @Override
  public void attach(CustomArrayObserver observer) {
    this.observer = observer;
  }

  @Override
  public void detach(CustomArrayObserver observer) {
    this.observer = null;
  }

  @Override
  public void notifyObserver() {
    observer.update(new CustomArrayEvent(this));
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    CustomArray that = (CustomArray) o;

    if (id != that.id) return false;
    return Arrays.equals(values, that.values);
  }

  @Override
  public int hashCode() {
    int result = id;
    result = 31 * result + Arrays.hashCode(values);
    return result;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("CustomArray{");
    sb.append("id=").append(id);
    sb.append(", values=").append(Arrays.toString(values));
    sb.append('}');
    return sb.toString();
  }


}
