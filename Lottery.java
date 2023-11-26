import java.util.Scanner;
import java.util.Random;
 
public class Lottery {
  public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);
    Random lot = new Random();   

System.out.println("please enter your unique three numbers:");
int guess = scanner.nextInt();

int lotterySpecial = lot.nextInt(900) +100;
System.out.println("our lucky numbers are: " +lotterySpecial);

int lotteryDigit1 = lotterySpecial / 100;
int lotteryDigit2 = lotterySpecial % 100 / 10;
int lotteryDigit3 = lotterySpecial / 100 % 10;

int guessDigit1 = guess / 100;
int guessDigit2 = guess % 100 / 10;
int guessDigit3 = guess / 100 % 10;

if(guess == lotterySpecial)System.out.println("\nyour entry is a match!!! you just won: $10,000.");

if(guessDigit3 == lotteryDigit1 || guessDigit2 == lotteryDigit3 || guessDigit1 == lotteryDigit2 )
System.out.println("\nyour entry is a match with one of ours!!! you just won: $1,000.");

if(guessDigit1 == lotteryDigit1 || guessDigit2 == lotteryDigit3 || guessDigit3 == lotteryDigit3)
System.out.println("\nyour entry is a match with two of ours!!! you just won: $3,000.");




   }
}