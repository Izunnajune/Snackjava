import java.util.Scanner;

  public class Interest {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter balance:");
    double bal = input.nextDouble();
    
    System.out.print("Enter annualInterestRate:");
    float rate = input.nextFloat();

    
    double interest = bal * (rate / 1200);

   System.out.printf("interest is %.5f%n", interest);
   }
}