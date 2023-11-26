import java.util.Scanner;

public class Integers {
  public static void main (String[] args) {   
    Scanner input = new Scanner(System.in); 

System.out.print("Enter a number:");
   int n1 = input.nextInt();

System.out.print("Enter a number:");
   int n2 = input.nextInt();

System.out.print("Enter a number:");
   int n3 = input.nextInt();

int product = n1*n2*n3;
  
System.out.printf("Product is %d%n", product);

    }
}