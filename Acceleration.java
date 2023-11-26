import java.util.Scanner;

    public class Acceleration {
      public static void main (String[] args)  {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter starting velocity: ");
      float v0 = input.nextFloat();
      
      System.out.print("Enter ending velocity:");
      float v1 = input.nextFloat();

      System.out.print("Enter time span:");
      float t = input.nextFloat();
     float result = (v1 - v0)/t; 
     System.out.printf("Result is %.4f%n", result);
      }
}