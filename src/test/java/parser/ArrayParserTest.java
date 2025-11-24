package parser;

import org.junit.jupiter.api.*;
import org.pasnikita.exception.ArrayException;
import org.pasnikita.parser.ArrayParser;
import org.pasnikita.parser.impl.ArrayParserImpl;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayParserTest {

  private ArrayParser parser = new ArrayParserImpl();

  @Test
  void testParseArray() throws ArrayException {

    int[] expected = new int[]{1, 2, 3};
    String actual = "1, 2, 3";

    assertArrayEquals(expected, parser.parseLine(actual));
  }

}
