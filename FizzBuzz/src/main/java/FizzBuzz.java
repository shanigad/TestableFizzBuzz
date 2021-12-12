import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {

  private int size;

  FizzBuzz(int size){
    this.size = size;
  }

  public ArrayList<String> play(){
       return  (ArrayList<String>) IntStream.range(0, size).mapToObj(i -> FizzBuzzCalculator
           .calculateFizzBuzz(i+1)).collect(Collectors.toList());
  }

}
