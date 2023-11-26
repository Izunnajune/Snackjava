public class SquareAndCube {
public static void main(String[] args)  {
int zero = 0;             int six = 6;      
int zerosq = 0*0;         int sixsq = 6*6;   
int zerocb = 0*0*0;       int sixcb = 6*6*6;

int one = 1;              int seven = 7;
int onesq = 1*1;          int sevensq = 7*7;
int onecb = 1*1*1;         int sevencb = 7*7*7;

int two = 2;              int eight = 8;
int twosq = 2*2;          int eightsq = 8*8;
int twocb = 2*2*2;        int eightcb = 8*8*8;

int three = 3;            int nine = 9;
int threesq = 3*3;        int ninesq = 9*9;
int threecb = 3*3*3;      int ninecb = 9*9*9;

int four = 4;             int ten = 10;
int foursq = 4*4;         int tensq = 10*10;
int fourcb = 4*4*4;       int tencb = 10*10*10;

int five = 5;             
int fivesq = 5*5;      
int fivecb = 5*5*5;	  

System.out.println("number\tsquare\tcube");
System.out.println(zero+ "\t"+zerosq+"\t"+zerocb);
System.out.println(one+ "\t"+onesq+"\t"+onecb);
System.out.println(two+ "\t"+twosq+"\t"+twocb);
System.out.println(three+ "\t"+threesq+"\t"+threecb);
System.out.println(four+ "\t"+foursq+"\t"+fourcb);
System.out.println(five+ "\t"+fivesq+"\t"+fivecb);
System.out.println(six+ "\t"+sixsq+"\t"+sixcb);
System.out.println(seven+ "\t"+sevensq+"\t"+sevencb);
System.out.println(eight+ "\t"+eightsq+"\t"+eightcb);
System.out.println(nine+ "\t"+ninesq+"\t"+ninecb);
System.out.println(ten+ "\t"+tensq+"\t"+tencb); 
  }
}