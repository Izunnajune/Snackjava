import java.util.Scanner;

 public class PoundsToKilogram {
      public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
   
   System.out.print("Enter a number:");
   double pounds = input.nextFloat();
  
   double kilogram = pounds * 0.454;
                                      
System.out.printf("kilogram == %.3f%n", kilogram);
   }
}