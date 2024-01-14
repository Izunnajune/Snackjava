import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EvenPositionTest{
         



@Test
public void checkingEvenIndices(){
 EvenPosition evenPositioner = new EvenPosition();
  String[] evenArr = {"Okro", "Page", "Bro", "Kyle", "Pen", "Mike"};

   String[] evenPos = evenPositioner.evenPosition(evenArr);
    String[] result = {"Page", "Kyle", "Mike"};
    
       assertArrayEquals(result, evenPos);


    }

 }