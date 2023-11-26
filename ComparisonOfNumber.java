import java.util.Scanner;

public class ComparisonOfNumber {
 public static void main(String[] args){
 Scanner scanner = new Scanner(System.in);

System.out.println("enter one integer");
int numR = scanner.nextInt();

int numSq = numR*numR;

if(numR > 100 || numSq > 100)System.out.println(numR+ " and " +numSq+ " are greater than 100");
if(numR == 100 || numSq == 100)System.out.println(numR+ " and " +numSq+ " are equals to 100");
if(numR != 100 || numSq != 100)System.out.println(numR+ " and " +numSq+ " are not equal to 100");
if(numR < 100 || numSq < 100)System.out.println(numR+ " and " +numSq+ " are less than 100");

  }
}