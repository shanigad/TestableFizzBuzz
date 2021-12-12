import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class FizzBuzzMathTest {

  @Test
  @Parameters({
      "4,2",
      "12,3",
      "100,5",
      "15,5",
      "60,15"
  })
  public void testShouldDividedBy(int dividend, int divisor){
    assertTrue(FizzBuzzCalculator.isDividedBy(dividend,divisor));
  }

  @Test
  @Parameters({
      "4,3",
      "12,5",
      "100,11",
      "15,12",
      "60,105"
  })
  public void testNotDividedBy(int dividend, int divisor){
    assertFalse(FizzBuzzCalculator.isDividedBy(dividend,divisor));
  }

  @Test
  @Parameters({
      "3",
      "6",
      "33",
      "333"

  })
  public void testFizz(int num){
    assertEquals("Fizz", FizzBuzzCalculator.calculateFizzBuzz(num));
  }

  @Test
  @Parameters({
      "5",
      "50",
      "500",
  })
  public void testBuzz(int num){
    assertEquals("Buzz", FizzBuzzCalculator.calculateFizzBuzz(num));
  }

  @Test
  @Parameters({
      "15",
      "30",
      "150",
  })
  public void testFizzBuzz(int num){
    assertEquals("FizzBuzz", FizzBuzzCalculator.calculateFizzBuzz(num));
  }

  @Test
  @Parameters({
      "1",
      "17",
      "101",
  })
  public void testNotFizzBuzz(int num){
    assertEquals(Integer.toString(num), FizzBuzzCalculator.calculateFizzBuzz(num));
  }

}
