import java.util.Scanner;
import java.util.Arrays;

public class CreditCardNumberTest{

public static void main(String...card1){
  Scanner cc = new Scanner(System.in);

   System.out.println("Enter card details for verification: ");
   String card = cc.nextLine();
      while (card.length() < 13 || card.length() > 16) {
	  System.out.println("Invalid input\nkindly enter card details for verification: ");
   	  card = cc.nextLine();
   }

    CreditCardNumber.setCardNumber(card);
  
    
     long[] numbers = new long[card.length()]; 
     long convert = Long.parseLong(card);
       
     for(int index = numbers.length - 1; index >= 0; index--){
         numbers[index] = convert % 10;
          convert = convert / 10; 
       }
  CreditCardNumber.setLongArray(numbers);
        System.out.println("********************************************");
	System.out.println("**Credit Card Type: " + CreditCardNumber.creditCardDet());
	System.out.println("**Credit Card Number: " + CreditCardNumber.getCardNumber());
	System.out.println("**Credit Card Digit Length: " + CreditCardNumber.getCardNumberLength());
	System.out.println("**Credit Card Validity Status: " + CreditCardNumber.cardValidity());	
	System.out.println("********************************************");
   
 }
}