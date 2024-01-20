import java.util.Scanner;

public class FindTheTwoLargestNumbers{
 public static void main(String... args){
   Scanner input = new Scanner(System.in);

      int counter = 0;
      int largest = 0;
      int number;
      int secondLargest = 0;
      int thirdLargest = 0;
      

    while(counter < 4){
         System.out.println("Enter number: ");
           number = input.nextInt();
           
        if(number > largest){ 
	  thirdLargest = secondLargest;
	  secondLargest = largest;
          largest = number;
        }
       
        else if(number > secondLargest){
          thirdLargest = secondLargest;
	  secondLargest = number;
         }    
         else if(number > thirdLargest){ 
	  thirdLargest = number;
             }
                 counter++;
      }

System.out.printf("The three largest numbers are: %d, %d, %d%n", largest, secondLargest,thirdLargest);
 





    }
}



 