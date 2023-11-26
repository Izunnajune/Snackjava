import java.util.Scanner;

public class Multiples {
 public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);

System.out.println("Enter integer:");
int num1 = scanner.nextInt();

System.out.println("Enter another integer:");
int num2 = scanner.nextInt();

int tripple1 = num1*num1*num1;
int tripple2 = num2*num2;

System.out.println("tripple of " +num1+ " is " +tripple1);
System.out.println("tripple of " +num2+ " is " +tripple2);

if(tripple1 % tripple2 == 0)
System.out.println("yes! " + tripple1 + " is a multiple of " + tripple2);
else System.out.println("no! " + tripple1 + " is not a multiple of " +tripple2);
}
  

}