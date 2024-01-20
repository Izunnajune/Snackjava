import java.util.Scanner;

  public class SalesCommissionCalculator{
    public static void main(String... params){
     Scanner scanner = new Scanner(System.in);

 
System.out.println("To get the earnings enter 0 as items sold for lastweek\n");



System.out.println("Items sold for last Week: ");
         int items = scanner.nextInt();



double profit = 200;


double values;
int sumValues = 0;

while (items != 0){
 
     System.out.println("Value for items sold: ");
         values = scanner.nextFloat();
          
             sumValues += values;
               
System.out.println("Items sold for last Week: ");
         items = scanner.nextInt();   

}

double percentageProfit = (double)9/100;

double earning = profit + (percentageProfit * sumValues);
 
System.out.println("Salesperson's earning for lastwek: $" +earning+"\n");

    } 

}