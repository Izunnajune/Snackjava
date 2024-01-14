public class CombineList{

 public static int[] alternator(int[] array1, int[] array2){
   int[] combine = new [array1.length, array2.length];
      int alt1 = 0;
      int alt2 = 0;  
   if(array1.length / 2 != 0){
        alt1 = (array1.length / 2) + 1;
}    
    else{
        alt1 = array1.length / 2;
}


int[] mainAlt = new int[alt1];


int counter = 0;
     for(int index = 0; index < array1.length; index += 2){
        mainAlt1[conter] = alt1[index];
          counter++;  
    }
  




return mainAlt1