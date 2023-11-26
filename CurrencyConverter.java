import java.util.Scanner;

    public class  CurrencyConverter {
      public static void main (String[] args)  {
      Scanner input = new Scanner(System.in);


System.out.println("Enter 0 to convert dollars to RMB:");
double rmb1 = input.nextDouble();

System.out.println("Enter 1 to convert RMB to dollar:");
double dollars1 = input.nextDouble();

System.out.println("Enter the dollar amount:");
double dollars2 = input.nextDouble();

double equivalence = 100*dollars2;

if(rmb1 == 0)System.out.printf("%.1f", equivalence);

System.out.println("Enter the RMB amount:");
double rmb2 = input.nextDouble();

double equivalence2 = rmb2/100;

if(dollars1 == 0)System.out.printf("%.1f", equivalence2);



   }
}