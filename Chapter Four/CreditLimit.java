import java.util.Scanner;

public class CreditLimit{
 public static void main(String... girls){
  Scanner scanner = new Scanner(System.in);


System.out.println("Enter account number: ");
  int accountNumber = scanner.nextInt();

System.out.println("Customer's name: ");
          String name = scanner.nextLine();
             scanner.nextLine();
       System.out.println("Beginning of the month balance: ");
          int beginningBalance = scanner.nextInt();

       System.out.println("Items charged by customer this month: ");
          int charges = scanner.nextInt();

       System.out.println("Total credits available: ");
          int credits = scanner.nextInt();

       System.out.println("Allowed credit limit: ");
         int creditLimit = scanner.nextInt();

       

 
int newBalance = (beginningBalance + charges) - credits;

System.out.println("Customer's new balance: " +newBalance);


if (newBalance > creditLimit){
   System.out.println("Credit Limit exceeded! ");
}
else{
  System.out.println("Credit Limit is: " +creditLimit);
}   

    }

}