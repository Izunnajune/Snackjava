import java.util.Scanner;

public class Decrypting{
  public static void main(String... args){
    Scanner scanner = new Scanner(System.in);

     System.out.print("Enter your encrypted four digit number: ");
       String pin = scanner.nextLine();

          while(pin.length() != 4){
            System.out.print("Wrong pin entered! \nEnter number to decrypt: ");
                pin = scanner.nextLine();
             }


        int firstNumber  = Integer.parseInt(String.valueOf(pin.charAt(2)));
         int secondNumber  = Integer.parseInt(String.valueOf(pin.charAt(3)));
         int thirdNumber  = Integer.parseInt(String.valueOf(pin.charAt(0)));
         int fourthNumber  = Integer.parseInt(String.valueOf(pin.charAt(1)));
          
            int digit1 = ((firstNumber + 3) % 10);
            int digit2 = ((secondNumber + 3) % 10);
            int digit3 = ((thirdNumber + 3) % 10);
            int digit4 = ((fourthNumber + 3) % 10);
         
         
       


  System.out.print("Orginal pin enetered is: "+digit1 + digit2 + digit3 + digit4);







}
}
        
        
     
        
