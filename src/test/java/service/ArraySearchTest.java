package service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.pasnikita.entity.CustomArray;
import org.pasnikita.exception.ArrayException;
import org.pasnikita.service.ArraySearch;
import org.pasnikita.service.impl.ArraySearchImpl;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraySearchTest {
  private ArraySearch arraySearch;
  private CustomArray customArray;

  @BeforeEach
  void setUp() {
    arraySearch = new ArraySearchImpl();
    customArray = new CustomArray(0, new int[]{1, 2, 3});
  }
  @AfterEach
  void tearDown() {
    arraySearch = null;
    customArray = null;
  }

  @Test
  void testFindMax() throws ArrayException {

    int actual = arraySearch.findMax(customArray);
    assertEquals(3, actual);

  }
  @Test
  void testFindMin() throws ArrayException {
    int actual = arraySearch.findMin(customArray);
    assertEquals(3, actual);
  }
}
