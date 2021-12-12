import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
  FizzBuzz fizzBuzz;
  @Test
  public void testEmpty() {
    fizzBuzz = new FizzBuzz(0);
    fizzBuzz.play();
    assertEquals(fizzBuzz.play().size(), 0);
  }


  public class FizzBuzzFixedSizeTest {
    int size = 100;

    @Before
    public void init() {
      fizzBuzz = new FizzBuzz(size);
    }

    @Test
    public void testValidSize() {
      assertEquals(fizzBuzz.play().size(), size);
    }

    @Test
    public void testValidFizzBuzz() {
      ArrayList<String> gameOutput = fizzBuzz.play();
      for (int i = 14; i < gameOutput.size(); i += 15) {
        assertEquals("FizzBuzz", gameOutput.get(i));
      }
    }

    @Test
    public void testValidFizz() {
      ArrayList<String> gameOutput = fizzBuzz.play();
      for (int i = 2; i < gameOutput.size(); i = i + 3) {
        if (!FizzBuzzCalculator.isDividedBy(i + 1, 5)) {
          assertEquals("Fizz", gameOutput.get(i));
        }
      }
    }

    @Test
    public void testValidBuzz() {
      ArrayList<String> gameOutput = fizzBuzz.play();
      for (int i = 4; i < gameOutput.size(); i = i + 5) {
        if (!FizzBuzzCalculator.isDividedBy(i + 1, 3)) {
          assertEquals("Buzz", gameOutput.get(i));
        }
      }
    }

    @Test
    public void testValidNumbers() {
      ArrayList<String> gameOutput = fizzBuzz.play();
      for (int i = 0; i < gameOutput.size(); i++) {
        if (!FizzBuzzCalculator.isDividedBy(i + 1, 3) &&
            !(FizzBuzzCalculator.isDividedBy(i + 1, 5))) {
          assertEquals(Integer.toString(i + 1), gameOutput.get(i));
        }
      }
    }
  }
}
