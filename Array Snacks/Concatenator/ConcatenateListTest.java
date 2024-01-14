import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConcatenateListTest{


@Test
public void concantenatingTester(){
 int[] sampleA = {1, 2, 3};
 int[] sampleB = {4, 5, 6};

  int[] sampleRead = ConcatenateList.concatinator(sampleA, sampleB);
    int[] result = {1, 2, 3, 4, 5, 6};
     assertArrayEquals(result, sampleRead);    

    }

 }