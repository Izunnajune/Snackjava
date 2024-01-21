import java.util.Scanner;

public class Cryptography{
  public static void main(String... args){
    Scanner scanner = new Scanner(System.in);

     System.out.print("Enter a four digit number: ");
      int pin = scanner.nextInt();

          while(pin < 1000 || pin > 9999){
            System.out.print("Error! \nEnter a four digit number: ");
                pin = scanner.nextInt();
             }
      
      int encrypt1 = 0;
      int encrypt2 = 0;
      int encrypt4 = 0;
      int encrypt3 = 0;
      
     
       
          int digit4 = pin % 10;
          encrypt4 = (digit4 + 7) % 10;
          int digit3A = pin % 100;
          int digit3B = digit3A / 10;
          encrypt3 = (digit3B + 7) % 10;
          int digit2A = pin / 100;
          int digit2B = digit2A % 10;
          encrypt2 = (digit2B + 7) % 10;
          int digit1A = pin / 1000;
          encrypt1 = (digit1A + 7) % 10;
              
          

           int temp1 = encrypt1;
           int temp2 = encrypt2;
           encrypt1 = encrypt3;
           encrypt2 = encrypt4;
           encrypt3 = temp1;
           encrypt4 = temp2;
        

 System.out.printf("%d%d%d%d", encrypt1, encrypt2, encrypt3, encrypt4);




       








   



}

}