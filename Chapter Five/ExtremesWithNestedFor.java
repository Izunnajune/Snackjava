import java.util.Scanner;

public class ExtremesWithNestedFor{
 public static void main(String... args){
   Scanner extremeInput = new Scanner(System.in); 


     System.out.println("How many values do you wish to enter: ");
       int flag = extremeInput.nextInt();
    
     
     int lowest = 0;
     int highest = 0;
   
      for(int counter = 0; counter < 1; counter++){
          System.out.println("Enter integer value: ");
             int number = extremeInput.nextInt();
	  
     lowest = number;
     highest = number;

	for (int count = 0; count < flag -1; count++) {
		System.out.println("Enter integer value: ");
       		   int numbers = extremeInput.nextInt();
	

	if (numbers > highest) highest = numbers;
	if (numbers < lowest) lowest = numbers;

		
	}
  }
int sum = highest + lowest;
       
System.out.printf("Highest number: %d, Lowest number: %d, Sumation of both of them: %d", highest, lowest,sum);
     }
}