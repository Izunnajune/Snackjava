import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfListTest{





@Test
public void functionForSumOfItems(){   
int[] numbers = {9, 20, 10};
int itemSum = SumOfList.sumOfItems(numbers);
    
int result = 39;

assertEquals(result, itemSum);
 }

}
