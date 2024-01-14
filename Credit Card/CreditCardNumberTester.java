import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreditCardNumberTester{
     


	@Test
	public void creditCardDet() {
	long[] array = {5, 3, 9, 9, 2,3,7,0,6,2,5,9,4,4,9,0};
	CreditCardNumber.setLongArray(array);

	String expected = "Master Card";
	String actual = CreditCardNumber.creditCardDet();

	assertEquals(expected, actual);

	}



      @Test
      public void creditCardDet2(){
      long[] array = {4, 4,5,6,8,9,2,1,3,4,5,6,7,7};
      CreditCardNumber.setLongArray(array);
      
       String expected = "Visa Card";
       String actual = CreditCardNumber.creditCardDet();
       
       assertEquals(expected, actual);
}
     
      @Test 
      public void oddPositionTest(){
	long[] array = {5, 3, 9, 9, 2,3,7,0,6,2,5,9,4,4,9,0};
	 CreditCardNumber.setLongArray(array);
	
	long expected = 30;
	long actual = CreditCardNumber.oddPosition();
	
	assertEquals(expected, actual);	
       
}

     @Test 
      public void evenPositionTest(){
	long[] array = {5, 3, 9, 9, 2,3,7,0,6,2,5,9,4,4,9,0};
	 CreditCardNumber.setLongArray(array);
	
	long expected = 40;
	long actual = CreditCardNumber.evenPosition();
	
	assertEquals(expected, actual);	
        
  }
    @Test void cardValidityTest(){
    long[] array = {5, 3, 9, 9, 2,3,7,0,6,2,5,9,4,4,9,1};
	 CreditCardNumber.setLongArray(array);
     String expected = "Invalid";
     String actual = CreditCardNumber.cardValidity();

     assertEquals(expected, actual);
  
  }
  
      @Test
      public void creditCardDet3(){
      long[] array = {3, 7,5,6,8,9,2,1,3,4,5,6,7,7};
      CreditCardNumber.setLongArray(array);
      
       String expected = "American Express card";
       String actual = CreditCardNumber.creditCardDet();
       
       assertEquals(expected, actual);
}   
    @Test
      public void creditCardDet4(){
      long[] array = {6, 7,5,6,8,9,2,1,3,4,5,6,7,7};
      CreditCardNumber.setLongArray(array);
      
       String expected = "Discover Card";
       String actual = CreditCardNumber.creditCardDet();
       
       assertEquals(expected, actual);
}   


}