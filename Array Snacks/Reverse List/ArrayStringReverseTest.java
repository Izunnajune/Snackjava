import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayStringReverseTest{




@Test
public void testingForStringReverse(){ 
 ArrayStringReverse arrayString = new ArrayStringReverse();
  
  String[] name = {"Ajiri", "Orisha", "Franklin", "Moh"};
  String[] reverse = arrayString.stringReverse(name);
   
   String[] expected = {"Moh", "Franklin", "Orisha", "Ajiri"};
    assertArrayEquals(expected, reverse);
    
  


   }

}