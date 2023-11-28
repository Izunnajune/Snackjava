import java.util.Scanner;
public class HighestScore {


public static void main(String... args){
Scanner scanner = new Scanner(System.in);

System.out.print("Enter number of students: ");
int numberOfStudents = scanner.nextInt();	


String name1 = "";
int highestScore = 0;
int counter = 0;
while(counter < numberOfStudents ){
	counter++;

System.out.print("Enter Student's Name: ");
String name = scanner.next();

System.out.print("Enter " +name + "'s Score: ");
int score = scanner.nextInt();

if(score > highestScore){
highestScore = score;
name1 = name;
}

}
   
System.out.printf("%n%s with a score of %d , is the student with the highest score!", name1, highestScore );   	



}

} 