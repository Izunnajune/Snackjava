import java.util.Scanner;
public class Cordinates{
 


public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);

int cordX1 = 0;
int cordX2 = 0;
int cordY1 = 0;
int cordY2 = 0;

int counter = 0;

     while(counter < 1){
       System.out.println("Enter X - cordinate of the first Point: ");
         cordX1 = scanner.nextInt();
  
       System.out.println("Enter Y - cordinate of the first Point: ");
         cordY1 = scanner.nextInt();


       System.out.println("Enter X - cordinate of the second Point: ");
         cordX2 = scanner.nextInt();


      System.out.println("Enter Y - cordinate of the second Point: ");
         cordY2 = scanner.nextInt();
            counter++;
     }


if(cordX1 == cordX2){
  System.out.println("The line connecting the two points is perpendicular to the Y axis");
}

else if(cordY1 == cordY2){
  System.out.println("The line connecting the two points is perpendicular to the X axis");
}

else{
  System.out.println("The line connecting the two points is not perpendicular to either axis");
    }

  }
}





