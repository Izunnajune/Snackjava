import java.util.Scanner;


public class EntrySumation{
 public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);


  System.out.println("Enter a number: ");
    int number = scanner.nextInt(); 

    
        int sum  = 0;
           while(number >= sum){
            System.out.println("Enter a number: ");
               int target = scanner.nextInt();
                  sum += target;   
          }
       System.out.println("Sum of numbers entered so far is: " +sum); 
    }
}