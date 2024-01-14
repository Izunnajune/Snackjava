import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class RunningTotalTest{
 

@Test
public void testForRunningTotal(){
 int[] sumCont = {1, 2, 3, 4, 5};
 int[] runningSum = RunningTotal.runningTotal(sumCont);
  int[] result = {1, 3, 6, 10, 15};
   assertArrayEquals(result, runningSum);

}

}