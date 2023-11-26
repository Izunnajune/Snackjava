import java.util.Scanner; 
public class AgeInYears {
 

public static void main(String[] args)  {
   Scanner input = new Scanner(System.in);

System.out.println("Please enter your age in years:");
int age = input.nextInt();

 int age1 = 365;
 int ageInDays = (age) * 365;

System.out.printf("= %d", ageInDays);

    }

}