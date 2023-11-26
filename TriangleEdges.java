import java.util.Scanner;
 
public class TriangleEdges {
  public static void main(String[] args){
   Scanner input = new Scanner(System.in);

System.out.println("Enter first triangle edge:");
int edge1 = input.nextInt();

System.out.println("Enter second triangle edge:");
int edge2 = input.nextInt();

System.out.println("Enter third triangle edge:");
int edge3 = input.nextInt();

int edgeSum1 = edge1 + edge2;
int edgeSum2 = edge2 + edge3;
int edgeSum3 = edge3 + edge1;


if(edgeSum1 > edge3)
System.out.printf("%nperimeter = %d", edge1 + edge2 + edge3);

else System.out.println("\ninvalid input");

  }

}