import java.util.Scanner;
 
public class DayOfTheWeek {
  public static void main(String[] args){
   Scanner input = new Scanner(System.in);

  System.out.println("Enter year:");
  int year = input.nextInt();

System.out.println("Enter month:");
  int m = input.nextInt();

System.out.println("Enter day of the month:");
  int q = input.nextInt();

int j = (year/100);
int k = (year%100);

int h = (q+(26*(m+1)/10) + k + (k/4) + (j/4) + (5*j)) % 7;

if(h == 0)System.out.println("Day of the week is Saturday");
if(h == 1)System.out.println("Day of the week is Sunday");
if(h == 2)System.out.println("Day of the week is Monday");
if(h == 3)System.out.println("Day of the week is Tuesday");
if(h == 4)System.out.println("Day of the week is Wednesday");
if(h == 5)System.out.println("Day of the week is Thursday");
if(h == 6)System.out.println("Day of the week is Friday");

  }
}