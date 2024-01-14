import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OddPositionTest{

 

@Test
public void oddPositionTester(){
 OddPosition oddPositioner = new OddPosition();
  int[] oddPos = {9, 12, 99, 24, 80};
   
   int[] oddPicker = oddPositioner.oddPosition(oddPos);
    int[] result = {9, 99, 80};
     assertArrayEquals(result, oddPicker); 
    

  }

}