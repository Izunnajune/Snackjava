import java.util.Scanner;
public class JavaLoop3 {


public static void main(String... args){
Scanner scanner = new Scanner(System.in);
	

int positive = 0;
int negative = 0;
int count = 0;
int total = 0;
	System.out.print("Enter a number: ");
		int number = scanner.nextInt();
if(number!=0){
while(number != 0){
	total+=number;
	count++;
	if(number>0){
		positive++;
		
	}

	if(number<0){
		negative++;
		
	}


        System.out.print("Enter a number: ");
	number = scanner.nextInt();  
}
      
	

}
double average  = (double)total/count;

System.out.println("Total number of postive numbers is " +positive);  

System.out.println("Total number of negative numbers is " +negative);
System.out.printf("Average of all numbers entered is %.2f%n ", average);
System.out.println("Total number of integers entered is " +count);
}

}