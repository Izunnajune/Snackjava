import java.util.Random;
import java.util.Scanner;

public class  HeadOrTail {
  public static void main(String[] args) {
   Random rand = new Random();
   Scanner input = new Scanner(System.in);

System.out.println("please take a guess 0 or 1:");
int guess = input.nextInt();

int randomN = rand.nextInt(2);
System.out.println(randomN);

if(guess == randomN)System.out.println("\nyour guess is correct");
else System.out.println("\nyour guess is wrong");




   }
}