import java.util.Scanner;

public class Palindromes{
 public static void main(String... args){
   Scanner input = new Scanner(System.in);



System.out.print("Enter a five digit number: ");
   int palindrome = input.nextInt();

        
        
           while(palindrome < 10000 || palindrome > 99999){
                 System.out.println("Error! \nEnter a five digit number:  ");
                       palindrome = input.nextInt();
                 }
                    
              int check = palindrome;

                  int palindromePassed = 0;  
                     while(palindrome != 0){
                         int palindromeNew = palindrome % 10;
                         palindromePassed = palindromePassed * 10 + palindromeNew;
                         palindrome /= 10;
                          
                 }

       if(palindromePassed == check){
              System.out.println("Yes! this is a palindrome ");
                  }

        else{
           System.out.println("Not a palindrone! ");     
       }
   }
}