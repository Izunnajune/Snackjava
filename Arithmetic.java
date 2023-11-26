import java.util.Scanner;

public class Arithmetic {
 public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);

System.out.println("pls enter number");
int num1 = scanner.nextInt();

System.out.println("pls enter number");
int num2 = scanner.nextInt();

System.out.println("pls enter number");
int num3 = scanner.nextInt();

int product = (num1*num2*num3);

int sum = (num1+num2+num3);

int average = (num1+num2+num3)/3;

System.out.println("product = " +product);
System.out.println("sum = " +sum);
System.out.println("average = " +average);

if(num1 < num2 && num1 < num3)System.out.println(num1+ " is the smallest number");
if(num2 < num1 && num2 < num3)System.out.println(num2+ " is the smallest number");
if(num3 < num2 && num3 < num1)System.out.println(num3+ " is the smllest number");
if(num1 > num2 && num1 > num3)System.out.println(num1+ " is the largest number");
if(num2 > num1 && num2 > num3)System.out.println(num2+ " is the largest number");
if(num3 > num2 && num3 > num1)System.out.println(num3+ " is the largest number");


  }


}