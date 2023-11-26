import java.util.Scanner; 

public class NumberCounter {
 

public static void main(String[] args)  {
Scanner input = new Scanner(System.in);

System.out.println("Please enter number:");
int num1 = input.nextInt();

System.out.println("Enter anoher number:");
int num2 = input.nextInt();

System.out.println("Enter another number:");
int num3 = input.nextInt();

System.out.println("Enter another number:");
int num4 = input.nextInt();

System.out.println("Enter another number:");
int num5 = input.nextInt();

int positive = 0;
int negative = 0;
int zeros = 0;

if(num1 > 0){
positive = positive +1;
if(num1 < 0)
negative = negative +1;
if(num1 == 0)
zeros = zeros +1;
}

if(num2 > 0){
positive = positive +1;
if(num2 < 0)
negative = negative +1;
if(num2 == 0)
zeros = zeros +1;
}

if(num3 > 0){
positive = positive +1;
if(num3 < 0)
negative = negative +1;
if(num3 == 0)
zeros = zeros +1;
}

if(num4 > 0){
positive = positive +1;
if(num4 < 0)
negative = negative +1;
if(num4 == 0)
zeros = zeros +1;
}

if(num5 > 0){
positive = positive +1;
if(num5 < 0)
negative = negative +1;
if(num5 == 0)
zeros = zeros +1;
}

System.out.println("Total number of positive numbers is " +positive);
System.out.println("Total number of negative numbers is " +negative);
System.out.println("Total number of zeros is " +zeros);



   }
}