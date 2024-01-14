import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ArrayLargestTest{




@Test
public void functionWithHighestNumber(){
  int[] numbers = {1,2,10,11,49};
  int highest = ArrayLargest.largestNumber(numbers);

  int expected = 49;

  assertEquals(expected, highest);

 }  

}






