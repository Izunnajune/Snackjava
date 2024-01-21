import java.util.Scanner;

public class FactorialsWithWhile{
  public static void main(String... args){
    Scanner scanner = new Scanner(System.in);

     System.out.println("Enter a number: ");
       long number = scanner.nextLong();
       
   System.out.print(number+ "!: " +number);
    long count = number - 1;
     while(count >= 1){
      System.out.printf(" X %d",count);
       number *= count;
        count--;
}
System.out.print(" = " +number);    

}
}