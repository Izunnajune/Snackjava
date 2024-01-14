import java.util.Arrays;

public class EvenPosition{
  
 
  public static void main(String[] args){
   EvenPosition even = new EvenPosition();
    String[] names = {"Kotlin", "Go", "Ada", "Swift", "Java", "JavaScript", "Python"};
     
     String[] prog = even.evenPosition(names);
	System.out.println("Elements in the even positions are " + Arrays.toString(prog));
}
   
  
public String[] evenPosition(String[] names){
    int length = names.length / 2;

      String[] newArray = new String[length];

int count = 0;
 for (int index = 1; index < names.length; index += 2){
   newArray[count] = names[index];
   count++; 
 
  }

  return newArray;
   }

}