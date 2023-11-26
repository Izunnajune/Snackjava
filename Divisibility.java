import java.util.Scanner;
 
public class Divisibility {
  public static void main(String[] args){
   Scanner input = new Scanner(System.in);

  System.out.println("Enter an integer:");
  int number = input.nextInt();

 int result = number%3;
System.out.println(number+ " divided by 3 is " + result);


if(result == 0)
System.out.println("yes " + number+ " is divisible by 3");
else System.out.println("no " + number+ " is not divisible by 3");





  }
}