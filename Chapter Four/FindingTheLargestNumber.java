import java.util.Scanner;

public class FindingTheLargestNumber{
 public static void main(String...args){
   Scanner scanner = new Scanner(System.in);


int number;
int counter = 0;
int largest = 0;

while(counter < 3){
   System.out.println("Enter number: ");
      number = scanner.nextInt();

   
if(number > largest){
   largest = number;
     }
   counter++;  
 }
  
System.out.println("The largest number is: " +largest);
  
  

    }
}


















