import java.util.Scanner;
 
 public class MyName {
   public static void main (String[] args) {
   Scanner input = new Scanner(System.in);

   System.out.print("What is my name?");
    String myName = input.nextLine();

 System.out.printf("Welcome %s%n", myName);
}
}

