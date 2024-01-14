import java.util.Arrays;

public class ReturnArray{
 
   public static void main(String... args){
    
   int number = 2342;
    System.out.println("The numbers converted to Array: " +Arrays.toString(arrayReturner(number)));
}
  


public static int[] arrayReturner(int number){
        
	String stringNumber = number + "";
	int length = stringNumber.length();

	int[] toArray = new int[length];  

	for(int count = length - 1; count >= 0; count--){
   		toArray[count] = number % 10;
		number /= 10;
  	} 
    
    
   return toArray;
}





}