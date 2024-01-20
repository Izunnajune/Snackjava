public class CheckerboardAsteriks{
 public static void main(String... args){
  
    


int counter = 0;
  while(counter <= 10){
     int column = 0;
     while(column <= 10){
       if((counter + column) % 2 == 0){
          System.out.print("* ");
       }  
     else{
          System.out.print(" ");
       }
        column++;
        
      }
System.out.println();      
         
counter++;
       }
     
     
  }
}