import java.util.Arrays;

public class SumOfList{

 public static void main(String... args){
     SumOfList sumOfList = new SumOfList();
      int[] numbers = {9, 20, 15};

      System.out.println("Sum of the numbers in this list is " +sumOfList.sumOfItems(numbers));
}


public static int sumOfItems(int[] numbers){
    
int counter = 0;
  /*for(int index = 0; index < numbers.length; index++){
    counter += numbers[index];
}*/


/*int index = 0;
 while(index < numbers.length){
   counter += numbers[index];
     index++; 
}*/
  

int index = 0;
  do {
       counter += numbers[index];  
       index++;
}while(index < numbers.length);
  


return counter;


  }
}