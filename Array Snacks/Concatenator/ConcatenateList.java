import java.util.Arrays;

public class ConcatenateList{
 

public static void main(String... args){
   
    int[] arr1 = {1, 9, 7, 5};
    int[] arr2 = {4, 19, 12, 16};
   
System.out.println("Concantenated Array: " +Arrays.toString(concatinator(arr1, arr2)));
}


public static int[] concatinator(int[] arr1, int[] arr2){
   int[] all = new int[arr1.length + arr2.length];
    

      for(int index = 0; index < arr1.length; index++){    
          all[index] = arr1[index];                 
}
    int counter = 0;  
    for(int index = arr1.length; index < all.length; index++){
        all[index] = arr2[counter];
          counter++;
}
 
return all;


  }
}