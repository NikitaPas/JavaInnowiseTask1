package org.pasnikita.entity;


import java.util.Arrays;

public class CustomArray {
  private int id;
  private int[] values;

  public CustomArray(int id, int[] values) {
    this.id = id;
    this.values = Arrays.copyOf(values, values.length);
  }

  public int getId() {
    return id;
  }

  public int[] getValues() {
    return Arrays.copyOf(values, values.length);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    CustomArray that = (CustomArray) o;

    if (id != that.id) return false;
    return Arrays.equals(values, that.values); // без Objects!
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
