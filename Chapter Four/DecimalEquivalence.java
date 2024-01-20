import java.util.Scanner;

public class DecimalEquivalence{
 public static void main(String... args){
   Scanner scanner = new Scanner(System.in);
   
    System.out.print("Enter set of binaries: ");
	String input = scanner.nextLine();
       int binaries = 0;
	int power = 0;
	int decimal = 0;
	int count = input.length() - 1;

        while(count >= 0){
          binaries = Integer.parseInt(String.valueOf(input.charAt(count)));
           decimal += binaries * Math.pow(2, power);
	  power++;
	  count--; 
         
  	}
          
      System.out.println("The decimal equivalent is: " + decimal);


  }
}