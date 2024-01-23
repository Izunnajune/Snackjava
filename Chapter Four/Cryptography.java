import java.util.Scanner;

public class Cryptography{
  public static void main(String... args){
    Scanner scanner = new Scanner(System.in);

     System.out.print("Enter a four digit number: ");
      String pin = scanner.nextLine();

          while(pin.length() != 4){
            System.out.print("Error! \nEnter a four digit number: ");
                pin = scanner.nextLine();
             }
      
          int firstNumber  = Integer.parseInt(String.valueOf(pin.charAt(0)));
          int secondNumber  = Integer.parseInt(String.valueOf(pin.charAt(1)));
          int thirdNumber  = Integer.parseInt(String.valueOf(pin.charAt(2)));
          int fourthNumber  = Integer.parseInt(String.valueOf(pin.charAt(3)));
          
           int digit1 = ((firstNumber + 7) % 10);
           int digit2 = ((secondNumber + 7) % 10);
           int digit3 = ((thirdNumber + 7) % 10);
           int digit4 = ((fourthNumber + 7) % 10);
           
           
        

 System.out.print(""+ digit3 + digit4 + digit1 + digit2);




       








   



}

}