public class CreditCardNumber{
  private static long[] numbers;
  private static String cardNumber;

   public static long evenPosition() {
	long sum = 0;
	for (int index = numbers.length - 2; index >= 0; index-= 2) {
		long temp = numbers[index] * 2;
		if (temp > 9) {
			temp = (temp % 10) + 1;
		}
		sum += temp;
	}
	return sum;
   }

   public static void setLongArray(long[] numbers){
     CreditCardNumber.numbers = numbers;
}
   public static void setCardNumber(String cardNumber){
     CreditCardNumber.cardNumber = cardNumber;
}
public static String getCardNumber(){
     return cardNumber;
}

public static int getCardNumberLength(){
     return cardNumber.length();
}

    public static long oddPosition() {
	long sum = 0;
	for (int index = numbers.length - 1; index >= 0; index-= 2) {
		
		sum += numbers[index];
	}
	return sum;
   }
     
   public static String creditCardDet(){
     
     if (numbers[0] == 4){
       return "Visa Card";
     
     }else if (numbers[0] == 5){
       return "Master Card";
     
     }else if (numbers[0] == 3 && numbers[1] == 7){
      return "American Express card";
     
     }else if (numbers[0] == 6){
       return "Discover Card";
     
     }else {
       return "Invalid Card";
     }  
   
  }

  public static String cardValidity() {
	long result = evenPosition() + oddPosition();
	if (result % 10 == 0) return "Valid";
	else return "Invalid";
  }

}