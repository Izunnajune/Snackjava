import java.util.Scanner;
 public class WorldPopulation {
  public static void main(String[] args){
   Scanner inserter = new Scanner(System.in);

  
System.out.println("Enter initial world population:");
  long world1 = inserter.nextLong();

System.out.println("Enter current world population:");
  long world2 = inserter.nextLong();

System.out.println("Enter annual groth rate:");
  int world3 = inserter.nextInt();

System.out.println("Enter number of years:");
  int noOfYears = inserter.nextInt();

double annualGrowth = world3/100;

double growthRate = world1 * 1 + annualGrowth * noOfYears;

System.out.printf("Estimated world population after %d years is %.3f ", noOfYears, growthRate);

  }
}