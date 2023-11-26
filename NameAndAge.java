import java.util.Scanner;

public class NameAndAge {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

   System.out.print("whats your name?");
   String yourName = input.nextLine();

   System.out.print("how old are you?");
   int yourAge = input.nextInt();

   System.out.printf("%s%n%d%n", yourName, yourAge);
  }
}