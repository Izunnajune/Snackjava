import java.util.Scanner;

public class RightangledTriangle{
  public static void main(String... args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter Triangle Base (from 1 to 10):");
       int base = scanner.nextInt();
         

          int count = base;
            while(count > 1 ){
              int newCounter = 1;
                count --;
               while(newCounter < count ){
                  System.out.print("*");
                     newCounter++;   
                 }  
                System.out.println();
                }

   
 
      }
}
