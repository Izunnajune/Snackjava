import java.util.Scanner;
 
public class IntegerSorting {
  public static void main(String[] args){
   Scanner input = new Scanner(System.in);

System.out.println("pls enter integer:");
  int number1 = input.nextInt();

System.out.println("please enter another integer:");
  int number2 = input.nextInt();

System.out.println("please enter another integer:");
  int number3 = input.nextInt();

if(number1 < number2 && number1 < number3)                       
System.out.printf("%d, %d, %d", number1,number2, number3);
  
if(number2 < number1 && number2 < number3)
System.out.printf("%d, %d, %d", number2,number1,number3);

if(number3 < number2 && number3 < number1)
System.out.printf("%d, %d, %d", number3,number2,number1);
 

  }
}