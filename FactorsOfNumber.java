import java.util.Scanner; 

public class FactorsOfNumber {
 

public static void main(String[] args)  {
   Scanner scanner = new Scanner(System.in);

System.out.println("Please enter a number:");
int number = scanner.nextInt();
int loop;

if(number < 1)
System.out.println("Invalid input!");

for (loop = 1; loop <= number; loop++) {
if(number % loop == 0) {
System.out.print(loop + " , ");
}	

  }
}
}