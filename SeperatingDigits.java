import java.util.Scanner;
 
public class SeperatingDigits {
  public static void main(String[] args){
   Scanner input = new Scanner(System.in);


System.out.println("kindly Enter five digits:");
int num = input.nextInt();

int dgt1 =  num % 10;
int dgt2 = num / 10;
int dgt3 = dgt2 % 10;
int dgt4 = dgt2 / 10;
int dgt5 = dgt4 % 10;
int dgt6 = dgt4 / 10;
int dgt7 = dgt6 % 10;
int dgt8 = dgt6 / 10;

System.out.printf("%n%d   %d   %d   %d   %d",dgt8,dgt7,dgt5,dgt3,dgt1);

  }
}