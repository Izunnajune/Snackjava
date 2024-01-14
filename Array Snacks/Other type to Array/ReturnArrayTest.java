import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReturnArrayTest{
   


@Test
public void functionThatReturnsOtherTypesToArray(){
 int num = 891278917;
  int[] arrayReturned = ReturnArray.arrayReturner(num);
  
     int[] result = {8, 9, 1, 2, 7, 8, 9, 1, 7};
        assertArrayEquals(result, arrayReturned);     



   }
}