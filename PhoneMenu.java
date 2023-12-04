import java.util.Scanner;

public class PhoneMenu {

 public static void main(String... args){
  Scanner sc = new Scanner(System.in);
	

System.out.println(" 1. Phone Book");
System.out.println(" 2. Messages");
System.out.println(" 3. Chat ");
System.out.println(" 4. Call Register");
System.out.println(" 5. Tones");
System.out.println(" 6. Settings");
System.out.println(" 7. Call Divert");
System.out.println(" 8. Games");
System.out.println(" 9. Calculator");
System.out.println(" 10. Reminders");
System.out.println(" 11. Clock");
System.out.println(" 12. Profiles");
System.out.println(" 13. SIM services");

System.out.print("\nselect option: ");
int num1 = sc.nextInt();

if(num1 == 1){
  System.out.println(" Phone book ");
     System.out.println("\t1. Search");
     System.out.println("\t2. Service Nos");
     System.out.println("\t3. Add Name");
     System.out.println("\t4. Erase");
     System.out.println("\t5. Edit");
     System.out.println("\t6. Assign tone");
     System.out.println("\t7. Send b' Card");
     System.out.println("\t8. Options");
     System.out.println("\t9. Speed Dials");
     System.out.println("\t10. Voice Tags");  
     
     System.out.print("\nselect option: ");
       int pb1 = sc.nextInt();
         
           if(pb1 == 1){
	          System.out.println("\nSearch ");
	       } 
                if(pb1 == 2){
	          System.out.println("\nService Nos ");
	        }if(pb1 == 3){
	          System.out.println("\nAdd name ");
		}if(pb1 == 4){
	          System.out.println("\nErase ");
                }if(pb1 == 5){
	          System.out.println("\nEdit ");
		}if(pb1 == 6){
	          System.out.println("\nAssign tone ");
		}if(pb1 == 7){
	          System.out.println("\nSend b' card ");
		}if(pb1 == 8){
	          System.out.println("1.Type of view "); 
		  System.out.println("2.Memory status ");
		}if(pb1 == 9){
	          System.out.println("\nSpeed Dials ");
		}if(pb1== 10){
	          System.out.println("\nVoice Tags");
                }
                 
}         
 
if(num1 == 2){
     System.out.println(" Messages ");
     System.out.println("\t1. Write messages");                 
     System.out.println("\t2. Inbox");
     System.out.println("\t3. Outbox");
     System.out.println("\t4. Picture messages :)");
     System.out.println("\t5. Templates");
     System.out.println("\t6. Smileys");
     System.out.println("\t7. Message settings");
              

       System.out.print("\nselect option: ");
          int message = sc.nextInt();
                 if(message == 1){
	        System.out.println("\n Write messages ");
	       } 
                if(message == 2){
	          System.out.println("\n Inbox ");
	        }if(message == 3){
	          System.out.println("\nOutbox");
		}if(message == 4){
	          System.out.println("\nPicture messages :) ");
                }if(message == 5){
	          System.out.println("\nTemplates ");
		}if(message == 6){
	          System.out.println("\nSmileys :)");
		}if(message == 7){
	          System.out.println("Message settings");
		   System.out.println(" \t1. Set 1");              
                     System.out.println("\t\t1. Message centre number ");
                     System.out.println("\t\t2. Message sent as ");
                     System.out.println("\t\t3. Message validity ");
                   System.out.println(" \t2. Common  ");
                     System.out.println(" \t\t1. Delivery reports");
                     System.out.println(" \t\t2. Reply via same centre");
                     System.out.println(" \t\t3. Character support");
                 System.out.println("8. Info service");
                 System.out.println("9. Voice mailbox");
                 System.out.println("10.Service command editor");


}
               










}











if(num1 == 3){
        System.out.println(" Chat ");
}

if(num1 == 4){
        System.out.println(" Call register ");
        System.out.println("\t1. Missed calls");
        System.out.println("\t2. Recievd calls");
        System.out.println("\t3. Dialed numbers");
        System.out.println("\t4. Erase recent call list");
	System.out.println("\t5. Show call duration");
	System.out.println("\t6. Show call costs");
	System.out.println("\t7. Call cost settings ");	
	System.out.println("\t8. Prepaid credit");
}

if(num1 == 5){
        System.out.println(" Tones ");
        System.out.println("\t1. Ringing tone");
        System.out.println("\t2. Ringing volume");
        System.out.println("\t3. Incoming call alerts");
        System.out.println("\t4. Composer");
	System.out.println("\t5. Message alert tone");
	System.out.println("\t6. Keypad tones");
	System.out.println("\t7. Warning and game tones ");
        System.out.println("\t8. Vibrating alert");
	System.out.println("\t9. Screen saver");
}

if(num1 == 6){
        System.out.println(" Settings ");
	System.out.println("\t1. Call settings");
        System.out.println("\t2. Phone setting");
        System.out.println("\t3. Security settings");
        System.out.println("\t4. Restore factory settings");
}


if(num1 == 7){
         System.out.println(" Call Divert ");
}
if(num1 == 8){
         System.out.println(" Games ");
}
if(num1 == 9){
         System.out.println(" Calculator ");
}
if(num1 == 10){
         System.out.println(" Reminders ");
}
if(num1 == 11){
        System.out.println(" Clock ");
	System.out.println("\t1. Alarm clock");
        System.out.println("\t2. Clock settings");
        System.out.println("\t3. Date settings");
        System.out.println("\t4. Stop watch");
	System.out.println("\t4. Countdown timer");
	System.out.println("\t4. Auto update of date and time");
}

if(num1 == 12){
         System.out.println(" Profiles ");
}
if(num1 == 13){
         System.out.println(" Sim services ");
}



}
}