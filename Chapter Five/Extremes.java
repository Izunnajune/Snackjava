import java.util.Scanner;

public class Extremes{
 public static void main(String... args){
   Scanner extremeInput = new Scanner(System.in); 


     System.out.println("How many values do you wish to enter: ");
       int flag = extremeInput.nextInt();
    
     
     int lowest = Integer.MAX_VALUE;
     int highest = Integer.MIN_VALUE;
   for(int counter = flag; counter >= 1; counter--){
      System.out.println("Enter integer value: ");
       int number = extremeInput.nextInt();
          if(number >= highest){
          highest = number;
     }     
        if(number < lowest){
           lowest = number;
      }
}
     int sum = highest + lowest;
       
System.out.printf("Highest number: %d, Lowest number: %d, Sumation of both of them: %d", highest, lowest);
       













}

}