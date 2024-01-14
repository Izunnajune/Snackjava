import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseListTest{


@Test
public void testingForReverse(){
 ReverseList reverseList = new ReverseList();
  
 int[] reverse = {49, 12, 90, 23};
   int[] reversing = reverseList.listReverse(reverse);
     
     //int[] result = {23, 90, 12, 49};
        assertArrayEquals(new int[]{23, 90, 12, 49}, reversing);


 } 
}