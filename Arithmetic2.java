import java.util.Scanner;

public class Arithmetic2 {
 public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);

System.out.println("Enter integer:");
int num1 = scanner.nextInt();

System.out.println("Enter another integer:");
int num2 = scanner.nextInt();
 
int square1 = num1 * num1;
int square2 = num2 * num2;

int squareSum = square1 + square2;
int squareDiff = square1 - square2;

System.out.println("squareroot of " +num1+ "  is " + square1);
System.out.println("squareroot of " +num2+ " is " +square2);
System.out.println("Sum of squareroots of " +num1+ " and " +num2+ " is " +squareSum);
System.out.println("Difference of their squareroot is " +squareDiff);


}
}