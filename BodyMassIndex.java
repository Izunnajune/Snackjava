import java.util.Scanner;

public class BodyMassIndex {
  public static void main(String[] args){
   Scanner input = new Scanner(System.in);

System.out.print("Enter weight in pounds:");
double weightpds = input.nextDouble();

System.out.print("Enter height in inches:");
double heightinch = input.nextDouble();

double weight = (weightpds)*0.45359237; //converting pounds to kilogram
double height = (heightinch)*0.0254; //converting inches to meters


double BMI = (weight)/(height*height);

System.out.printf("Body Mass Index = %.4f%n", BMI);



   }




}