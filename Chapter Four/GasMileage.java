import java.util.Scanner;

public class GasMileage{

 public static void main(String... params){
   Scanner scanner = new Scanner(System.in);
    


double totalMilesPerGallon = 0;
int trips = 0;
int tripCount = 0;
double milesPerGallon = 0;


System.out.println("\nNote: Enter -5 as miles coverd to get your Gas Mileage Usage!");

System.out.println("\nEnter miles driven: ");
int miles = scanner.nextInt();

while(miles != -5){
     System.out.println("Enter number of gallons used: ");
        int gallon = scanner.nextInt();
        
     milesPerGallon = (double)miles/gallon;
     System.out.printf("Miles Per gallon for trip above is: %.2fm/g%n", milesPerGallon);
      
        tripCount += 1;
     
     totalMilesPerGallon += milesPerGallon;
	
    System.out.println("\nEnter miles driven: ");
        miles = scanner.nextInt();
  }

System.out.println("Total number of trips is: " + tripCount);

System.out.printf("Miles per Gallon for each trip: %.2fm/g , %nOverall miles per gallon trip: %.2fm/g%n", milesPerGallon,totalMilesPerGallon);



  }
}