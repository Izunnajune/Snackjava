import java.util.Scanner;

public class TaxCollector{
 public static void main(String... args){
   Scanner input = new Scanner(System.in);
     
int counter = 0;
double benchPay1 = 30000;    
double benchPay2;
double benchPayTax;
double taxRate1 = 0.15;
double taxRate2 = 0.20;
double smallTax;
double mainTax = 0;

while(counter < 3){
  System.out.println("Enter citizen's name: ");
    String name = input.nextLine();
       

  System.out.println("Enter " +name+"'s earning: ");
    double earning = input.nextDouble();
   
      if(earning > benchPay1){
        benchPayTax =  earning * taxRate1; 
        benchPay2 = earning - benchPay1;
        smallTax =  benchPay2 * taxRate2;
        mainTax = benchPayTax + smallTax;
       } 
      else if(earning <= benchPay1 && earning >= 0){
        mainTax =  earning * taxRate1;
      }
      else{ 
        System.out.println("Inavlid earning, go and hustle! ");
           continue;
         }

System.out.printf("%s's Total Tax: %.2f ", name, mainTax);         
        counter++;


          }

     }     
}