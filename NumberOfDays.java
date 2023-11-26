import java.util.Scanner;

 public class NumberOfDays{
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);

System.out.println("Kindly enter month in number:");
int month = input.nextInt();

System.out.println("Kindly enter year:");
int year = input.nextInt();



if(month == 1)System.out.printf("January %s %s%n",year,  "had 31 days.");
if(month == 2)System.out.printf("February %s %s%n",year,  "had 29 days.");
if(month == 3)System.out.printf("March %s %s%n",year,  "had 31 days.");
if(month == 4)System.out.printf("April %s %s%n",year,  "had 30 days.");
if(month == 5)System.out.printf("May %s %s%n",year,  "had 31 days.");
if(month == 6)System.out.printf("june %s %s%n",year,  "had 30 days.");
if(month == 7)System.out.printf("July %s %s%n",year,  "had 31 days.");
if(month == 8)System.out.printf("August %s %s%n",year,  "had 31 days.");
if(month == 9)System.out.printf("September %s %s%n",year,  "had 30 days.");
if(month == 10)System.out.printf("October %s %s%n",year,  "had 31 days.");
if(month == 11)System.out.printf("November %s %s%n",year,  "had 30 days.");
if(month == 12)System.out.printf("December %s %s%n",year,  "had 31 days.");
  }
}