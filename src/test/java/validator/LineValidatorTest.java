package validator;

import org.junit.jupiter.api.*;
import org.pasnikita.validator.LineValidator;
import org.pasnikita.validator.impl.LineValidatorImpl;

import static org.junit.jupiter.api.Assertions.*;

public class LineValidatorTest  {

  private LineValidator lineValidator = new LineValidatorImpl();

  @Test
  void testValidateFalse() {
    String actual = "1; 2; x3; 6..5; 77";

    assertFalse(lineValidator.isValid(actual));
  }
  @Test
  void testValidateTrue() {
    String actual = "1, 2, 3; 4 5";

    assertTrue(lineValidator.isValid(actual));
  }
}
