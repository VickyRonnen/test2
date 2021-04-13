package nl.denkzelf.test2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tester2 {

  public String myHelper() {
    return "this helps";
  }

  public static String myStaticHelper() {
    return "this helps static";
  }

  @Test
  void myHelperTest() {
    Assertions.assertEquals("this helps",myHelper());
  }

  @Test
  void myStaticHelperTest() {
    Assertions.assertEquals("this helps static",myStaticHelper());
  }

}
