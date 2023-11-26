import java.util.Scanner; 

public class PrimeNumbers {
 

public static void main(String... args)  {
   Scanner scanner = new Scanner(System.in);

System.out.println("Please enter a positive integer:");
int number = scanner.nextInt();
boolean isPrimeNumber = true;
// boolean isNotPrimeNumber = false;

if(number <= 1)
System.out.println("not a positive integer!");

for (int prime = 2;prime < number; prime++) {
	if(number / 2 == 0 || number % prime == 0) {
		isPrimeNumber = false;
		System.out.println((number) + " can be divided by " + (prime) + " without remainder");
	}	

	
  }

if (isPrimeNumber) {
	System.out.println("Yes! " +number+ " is a prime number");
}

else
	System.out.println("No sir! " +number+ " is not a prime number");


}
}