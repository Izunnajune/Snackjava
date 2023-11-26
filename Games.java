import java.util.Scanner;

 public class Games{
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);

System.out.println("Enter player one name:");
String player1 = input.nextLine();

System.out.println("Enter player two name:");
String player2 = input.nextLine();

System.out.printf("Enter  0, 1 or 2, %s:", player1);
int paper = input.nextInt();
System.out.printf("Enter 0,1 or 2, %s:", player2);
int rock = input.nextInt();

if(paper == 0 && rock == 1)System.out.printf("%s lost to %s%n", player1, player2);
if(paper == 0 && rock == 2)System.out.printf("%s lost to %s%n", player1, player2);
if(paper == 1 && rock == 0)System.out.printf("%s won %s%n", player1, player2);
if(paper == 1 && rock == 2)System.out.printf("%s lost to %s%n", player1, player2);
if(paper == 2 && rock == 0)System.out.printf("%s won %s%n", player1, player2);
if(paper == 2 && rock == 1)System.out.printf("%s won %s%n", player1, player2);
if(paper == 0 && rock == 0)System.out.printf("%s draws %s%n", player2, player1);
if(paper == 1 && rock == 1)System.out.printf("%s draws %s%n", player2, player1);
if(paper == 2 && rock == 2)System.out.printf("%s draws %s%n", player2, player1);

   }
}


   