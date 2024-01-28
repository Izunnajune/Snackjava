public class IntegersDivByThree{
  public static void main(String... args){
   

System.out.print("Numbers from 1 to 30 that are divisible by 3: ");
    
      int sum = 0;
     int counter;
    for(counter = 1; counter <= 30; counter++){
         if(counter % 3 == 0){
         System.out.print(" "+counter);           
            
		sum += counter;
 }
     }

  System.out.println("\nSum of numbers that are divisible by 3 between 1 and 30: " +sum);  
   }

}