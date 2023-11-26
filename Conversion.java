import java.util.Scanner;
 public class Conversion{
  public static void main(String[] args){
   Scanner input = new Scanner(System.in);

  System.out.println("Enter celcius in degree:");
  double celcius = input.nextDouble();

Double result = (9.0/5) * (celcius) + (32);
System.out.printf("celcius is %.1f%nFahrenheit", result);




}
}