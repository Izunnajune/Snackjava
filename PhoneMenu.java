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
     System.out.println("\t8. Info service");
     System.out.println("\t9. Voice mailbox number");
     System.out.println("\t10.Service command editor");         

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
	          System.out.println("\nPicture messages ");
                }if(message == 5){
	          System.out.println("\nTemplates ");
		}if(message == 6){
	          System.out.println("\nSmileys :) ");
		}if(message == 7){
	          

                  System.out.println("Message settings");
		   System.out.println(" \t1. Set 1");              
                     System.out.println("\t\t1. Message centre number ");
                     System.out.println("\t\t2. Message sent as ");
                     System.out.println("\t\t3. Message validity ");
                   
                        System.out.print("\nselect option: ");
                            int set = sc.nextInt();
                                       if(set == 1){
	                                  System.out.println("\nMessage centre number ");
		                           }if(set == 2){
	                                   System.out.println("\nMessage sent as");
		                            }if(set == 3){
                                             System.out.println("\nMessage validity");
                                             System.out.println(" \t2. Common  ");
                                             System.out.println(" \t\t1. Delivery reports");
                                             System.out.println(" \t\t2. Reply via same centre");
                                             System.out.println(" \t\t3. Character support"); 
                                             }
                                             
                                            
                 }if(message == 8){
                 System.out.println("\n Info service");
                 }if(message == 9){
                 System.out.println("\n Voice mailbox");
                 }if(message == 10){                 
                 System.out.println("\n Service command editor");
                 }


}

if(num1 == 3){
        System.out.println(" \n Chat ");
}

if(num1 == 4){
        System.out.println("4. \nCall register ");
        System.out.println("\t1. Missed calls");
        System.out.println("\t2. Recievd calls");
        System.out.println("\t3. Dialed numbers");
        System.out.println("\t4. Erase recent call list");
	System.out.println("\t5. Show call duration");
	System.out.println("\t6. Show call costs");
	System.out.println("\t7. Call cost settings ");	
	System.out.println("\t8. Prepaid credit");

             System.out.print("\nselect option: ");
                  int register = sc.nextInt();

              if(register == 1){
	        System.out.println("\n Missed calls ");
	       } 
                if(register == 2){
	          System.out.println("\n Recieved calls");
	        }if(register == 3){
	          System.out.println("\nDialed numbers");
		}if(register == 4){
	          System.out.println("\nErase recent call lists ");
                }if(register == 5){
	          System.out.println("\n4. Show call duration ");
                  System.out.println("\t1. Last call duration ");
                  System.out.println("\t2. All calls' duration ");
                  System.out.println("\t3. Recieved calls' duration ");
                  System.out.println("\t4. Dialled calls' duration ");
                  System.out.println("\t5. Clear timers ");
                
                      System.out.print("\nselect option: ");
                         int duration = sc.nextInt();
                     if(duration == 1){
	        System.out.println("\n Last call duration ");
	       } 
                if(duration == 2){
	          System.out.println("\n All calls' duration");
	        }if(duration == 3){
	          System.out.println("\nRecieved calls' duration ");
		}if(register == 4){
	          System.out.println("\nDialled calls' duration ");
                }if(register == 5){                    
                  System.out.println("\nClear timers ");
                }

            }if(register == 6){
	          System.out.println("\n6. Show call costs ");
                    System.out.println("\t1. Last call cost ");
                    System.out.println("\t2. All calls' cost ");
                    System.out.println("\t3. Clear counters ");
                     
                        System.out.print("\nselect option: ");
                            int cost = sc.nextInt();
                                       if(cost == 1){
	                                  System.out.println("\nLast call cost ");
		                           }if(cost == 2){
	                                   System.out.println("\nAll calls' cost");
		                            }if(cost == 3){
                                             System.out.println("\nClear counters");
                                            }

          }if(register == 7){
              System.out.println("\n7. Call cost settings ");
              System.out.println("\t1. Call cost limit ");
              System.out.println("\t2. Show costs in ");
              
              System.out.print("\nselect option: ");
                            int reg = sc.nextInt();
                                        if(reg == 1){
	                                   System.out.println("\nCall cost limit ");
		                           }if(reg == 2){
	                                   System.out.println("\nShow costs in ");
                                           } 


          }if(register == 8 ){
             System.out.println("\n Prepaid credit  ");
             }


         
}




if(num1 == 5){
        System.out.println("5. Tones ");
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
        
           System.out.print("\nselect option: ");
                            int callSet = sc.nextInt();
                             if(callSet == 1){
	                      System.out.println(" Call settings ");
	                      System.out.println("\t1. Automatic redial");
		              System.out.println("\t2. Speed dialing");
                              System.out.println("\t3. Call waiting options ");
		              System.out.println("\t4. Own number setting");
                              System.out.println("\t5. Phone line in use");
                              System.out.println("\t6. Automatic answer");
                              
                               
                                System.out.print("\nselect option: ");
                                     int callSet1 = sc.nextInt();
                                       if(callSet1 == 1){
	                                  System.out.println("\n Automatic redial ");
		                           }if(callSet1 == 2){
	                                   System.out.println("\n Speed dial");
		                            }if(callSet1 == 3){
                                             System.out.println("\n Call waiting options ");
                                            }if(callSet1 == 4){
                                             System.out.println("\n Own number setting ");
                                              }if(callSet1 == 5){
                                             System.out.println("\n Phone line in use ... ");
                                               }if(callSet1 == 6){
                                             System.out.println("\n Automatic answer ");
                                                  }



                       
                       }if(callSet == 2){
	                      System.out.println(" Phone settings ");
	                      System.out.println("\t1. Language");
		              System.out.println("\t2. Cell info display");
                              System.out.println("\t3. Welcome note ");
		              System.out.println("\t4. Network selection");
                              System.out.println("\t5. Lights");
                              System.out.println("\t6. Confirm SIM service actions");
                                       
                                    System.out.print("\nselect option: ");
                                     int phoneSet = sc.nextInt();
                                       
                                         if(phoneSet == 1){
	                                  System.out.println("\n Phone settings ");
		                           }if(phoneSet == 2){
	                                   System.out.println("\n Language");
		                            }if(phoneSet == 3){
                                             System.out.println("\n Welcome note ");
                                            }if(phoneSet == 4){
                                             System.out.println("\n Network selection ");
                                              }if(phoneSet == 5){
                                             System.out.println("\n Lights ");
                                               }if(phoneSet == 6){
                                             System.out.println("\n Confirm SIM service actions ");
                                                  }

                               }if(callSet == 3){
	                          System.out.println(" Security settings ");
	                          System.out.println("\t1. PIN code request");
		                  System.out.println("\t2. Call barring service");
                                  System.out.println("\t3. Fixed dialing ");
		                  System.out.println("\t4. Closed user group");
                                  System.out.println("\t5. Phone security");
                                  System.out.println("\t6. Change access codes");
                                       
                                     System.out.print("\nselect option: ");
                                     int security = sc.nextInt();
                                       
                                         if(security == 1){
	                                  System.out.println("\n PIN code ");
		                           }if(security == 2){
	                                   System.out.println("\n Call barring service");
		                            }if(security == 3){
                                             System.out.println("\n Fixed dialing");
                                            }if(security== 4){
                                             System.out.println("\n Closed user group ");
                                              }if(security == 5){
                                             System.out.println("\n Phone security ");
                                               }if(security == 6){
                                             System.out.println("\n Change access codes ");
                                                }
                           }if(callSet == 4){
	                      System.out.println(" \n Restore factory settings ");
                              }

              
            
         }


if(num1 == 7){
         System.out.println(" \nCall Divert ");
}
if(num1 == 8){
         System.out.println(" \nGames ");
}
if(num1 == 9){
         System.out.println(" \nCalculator ");
}
if(num1 == 10){
         System.out.println(" \nReminders ");
}
if(num1 == 11){
        System.out.println(" Clock ");
	System.out.println("\t1. Alarm clock");
        System.out.println("\t2. Clock settings");
        System.out.println("\t3. Date settings");
        System.out.println("\t4. Stop watch");
	System.out.println("\t5. Countdown timer");
	System.out.println("\t6. Auto update of date and time");

                           System.out.print("\nselect option: ");
                                     int clock = sc.nextInt();
                                       if(clock == 1){
	                                  System.out.println("\n Alarm clock ");
		                           }if(clock == 2){
	                                   System.out.println("\n Clock settings");
		                            }if(clock == 3){
                                             System.out.println("\n Date setting ");
                                            }if(clock == 4){
                                             System.out.println("\n Stop watch ");
                                              }if(clock == 5){
                                             System.out.println("\n Countdown timer ");
                                               }if(clock == 6){
                                             System.out.println("\n Auto upadate of date and time ");
                                                }

               
}

if(num1 == 12){
         System.out.println(" \nProfiles ");
}
if(num1 == 13){
         System.out.println(" \nSim services ");
}



}
}