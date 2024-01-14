public class ArrayStringReverse{

public String[] stringReverse (String [] names){
 String[] stringArray = new String[names.length];
  
 int counter = names.length - 1;
	for(int index = 0; index < names.length; index++) {
		stringArray[counter] = names[index];
		counter--;
           }

    return stringArray;
 
  }

}