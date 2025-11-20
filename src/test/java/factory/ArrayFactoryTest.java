package factory;

import org.junit.jupiter.api.*;
import org.pasnikita.entity.CustomArray;
import org.pasnikita.exception.ArrayException;
import org.pasnikita.factory.ArrayFactory;
import org.pasnikita.factory.impl.ArrayFactoryImpl;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayFactoryTest {
  private ArrayFactory arrayFactory;
  private int[] expectedArray;

  @BeforeEach
  void setUp() {
    expectedArray  = new int[]{1,5,6,7};
    arrayFactory = new ArrayFactoryImpl();
  }
  @AfterEach
  void tearDown() {
    expectedArray = null;
    arrayFactory = null;
  }

  @Test
  void testArrayFactory() throws ArrayException {
    CustomArray actual = arrayFactory.createArray(expectedArray);
    assertArrayEquals(expectedArray, actual.getValues());

  }

}
