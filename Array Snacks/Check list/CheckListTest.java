import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CheckListTest {



@Test
public void checkingIfAListIsPresent(){
 CheckList checkList = new CheckList();
  int[] checkMain = {2, 9, 3, 8};
   int number = 2; 
    boolean checkMain2 = checkList.existing(checkMain, number);
     assertTrue(checkMain2);
   }

}