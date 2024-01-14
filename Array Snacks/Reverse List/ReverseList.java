
public class ReverseList{

    public int[] listReverse(int[] numbers){

	int[] newArray = new int[numbers.length];
	int counter = numbers.length - 1;

	for(int index = 0; index < numbers.length; index++) {
		newArray[counter] = numbers[index];
		counter--;
		
	}
		return newArray;
   }

}




 