import java.util.Scanner;
 public class NumberInWords{
  public static void main(String[] args){
   Scanner input = new Scanner(System.in);

  System.out.println("Enter a number from 1 to 10:");
  int number = input.nextInt();
   
    if(number == 1)System.out.print("one");
    if(number == 2)System.out.print("two");
       if(number == 3)System.out.print("three");
      if(number == 4)System.out.print("four");
       if(number == 5)System.out.print("five");
if(number == 6)System.out.print("six");
if(number == 7)System.out.print("seven");
if(number == 8)System.out.print("eight");
if(number == 9)System.out.print("nine");
if(number == 10)System.out.print("ten");
 }
}
