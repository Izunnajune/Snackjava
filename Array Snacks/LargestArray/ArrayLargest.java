public class ArrayLargest{


public static int largestNumber (int[] numbers){
 int highest = numbers[0];
  for (int index = 1; index < numbers.length; index++){
    
     if(numbers[index] > highest){
        highest = numbers[index];
     }
   }
return highest;
}


public static void main(String... args){

  int[] numbers = {1,2,10,11,49, 100};
  int highest = largestNumber(numbers);

System.out.println("largest number is " +highest);

 }  

}






 