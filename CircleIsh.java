import java.util.Scanner;

public class CircleIsh {
 public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);

System.out.println("kindly input circle raduis:");
float radius = scanner.nextFloat();


double diameter = 2*radius;
double circumference = 2*3.14159*radius;
double area = 3.14159*radius*radius;

System.out.printf("%nDiameter of the circle = %.0f ", diameter);
System.out.printf("%nCircumference of the circle = %.2f ", circumference);
System.out.printf("%nArea of the circle = %.2f ", area);

  }
}