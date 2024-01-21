import java.util.Scanner;

public class WorldPopulation{



 public static void main(String... args){
   Scanner scanner = new Scanner(System.in);     

      System.out.println("Enter year in view: "); 
       int currentYear =  scanner.nextInt(); 

      System.out.println("Enter initial population: "); 
       long initialPopulation =  scanner.nextLong(); 

 
         double rate = (0.91/100) * initialPopulation; 
 



        System.out.print("Year Range \tPopulation \t\t\t\t\tIncrease\n" );

       int numberOfYears = 75;
       int range = 0;
 
       long population = 0;
       while(range <= numberOfYears){
           currentYear += 1;
           double population1 = initialPopulation * Math.pow((1+rate), range);
           population = Math.round(population1);    
           long increase = population - initialPopulation;
              System.out.println();
              System.out.println(currentYear+ "\t\t"+population+ "\t\t\t\t"+increase);
                         range++;
                 }

           if(population >= (initialPopulation * 2)){
                System.out.println("\nThe year that will have double of today's population is the year " +currentYear);
             }           
               

            }


        }