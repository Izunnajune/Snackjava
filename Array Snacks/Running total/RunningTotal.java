import java.util.Arrays;

public class RunningTotal{
 
public static void main(String... args){
  RunningTotal totalElements = new RunningTotal();
   int[] numbers = {78, 12, 19, 50, 70};
     
   int[] sumAll = totalElements.runningTotal(numbers);
     System.out.println("Running total of the list is "  + Arrays.toString(sumAll));
   
}


public static int[] runningTotal(int[] numbers){
 int[] runningSum = new int[numbers.length];
  
  int sum = 0;
  int count = 0;
     for(int index = 0; index < numbers.length; index++){
       sum += numbers[index];
       runningSum[count] = sum;
         count++; 
}
return runningSum;
    }
}