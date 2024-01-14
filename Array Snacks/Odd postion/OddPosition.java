import java.util.Arrays;

public class OddPosition{

  public static void main(String[] args) {
	OddPosition odd = new OddPosition();
	int[] numbers = {4, 7, 99, 5, 87, 90, 12};

	int[] result = odd.oddPosition(numbers);
	System.out.println("Elements in odd positions are " + Arrays.toString(result));
}

  public int[] oddPosition(int[] numbers){
	
  int length = 0;

  if (numbers.length % 2 != 0) {
	length = (numbers.length / 2) + 1;
  }

  else {
	length = numbers.length / 2;
  }

  int[] newArray = new int[length];
    int count = 0;
      for (int index = 0; index < numbers.length; index += 2){
         newArray[count] = numbers[index];
            count++; 
 
}
  

return newArray;




   }
}