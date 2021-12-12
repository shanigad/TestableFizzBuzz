public class FizzBuzzCalculator {

  public static String calculateFizzBuzz(int num){
    String retVal = "";

    if(isDividedBy(num,3)){
      retVal =  "Fizz";

    }
    if(isDividedBy(num,5)){
      retVal += "Buzz";
    }

    return retVal.isEmpty()? String.valueOf(num): retVal;
  }


  public static boolean isDividedBy(int dividend, int divisor){
    return (dividend % divisor) == 0;
  }
}
