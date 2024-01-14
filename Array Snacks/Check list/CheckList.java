public class CheckList{


   public boolean existing(int[] numbers, int number){



	for(int index = 0; index < numbers.length; index++) {
		if (number == numbers[index]) {
			return true;
		}
		
		
	}
	return false;

  }
}