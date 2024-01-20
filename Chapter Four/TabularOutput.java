import java.util.Scanner;

public class TabularOutput{
 public static void main(String... args){
   Scanner scanner = new Scanner(System.in);

int number = 1;
System.out.println("N\tN2\tN3\tN4\n");

while(number < 6){
  System.out.println(number+ "\t" +number*number+ "\t" +number*number*number+ "\t" +number*number*number*number);
     number++;
}




  }

}


