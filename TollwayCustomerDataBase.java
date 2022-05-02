import java.util.*;
import java.text.NumberFormat;     //You can also use other formatting methodology
import java.util.Locale;
import java.util.Random;           //You can also use other random number generation tactics
//Contestant Number 00068130
public class TollwayCustomerDataBase 
   {

   
   public static void main (String args [])
      {
      
      //Pre loaded Address data: pass these into the Customer constructor
      //"Montana","Jose", "Ford", "F150", "ABC-123", 55.00
      Customer c= new Customer("Montana","Jose", "Ford", "F150", "ABC-123", 55.00);
      //Pre loaded Address data: pass these into the MailingAddress constructor, and this object is stored as a field 
      //in the Customer object
      //"3445 Rockhill Rd.", "Santa Fe", "New Mexico", "77777"
      MailingAddress a = new MailingAddress("3445 Rockhill Rd.", "Santa Fe", "New Mexico", "77777");
   
      
      
      
                    
   
      }
   
   //Prompts the user to submit a deposit: calls other helper methods //////////////////////////////////////
   
   private static void setDepositCustomerRecord(Customer c)
      {
   
       System.out.println("Customer Record Input Successful\n");
       System.out.println("Type in \"Yes\" if you want update this record");
       System.out.println("ENTER: Yes or No:" +getUserStringInput());
       if(getUserStringInput().equals("Yes")) {
    	   System.out.println("All new records require a new deposit."
    	   		+ "How much will the customer be depositing?");
    	   
    	  System.out.println("Please enter in a value between $1.00 to $9,999.99:"+getUserNumberInput());
      
    	//I call it quits, my java version is outdated , can't read the class files, too late
    	//to restart at this point, spent a solid 40 minutes trying to get the program to work.
      
       }
       
      }
  
   //Creates and stores the reference ID (random letters and numbers) //////////////////////////////////////
   //helper method 
   private static void setReferenceID(Customer c)
      {
     
      }
   
   //Displays the message in console after a successful deposit entry //////////////////////////////////////
   //helper method 
   private static String getDepositMessage(Customer c)
      {
      return null;
      }
   
   
   //Gets the user input for the yes or no prompts and turns it into LC //////////////////////////////////////
   //helper method 
   private static String getUserStringInput()
      {
	   return null;
      }  
   
   //Gets the user input for the deposit prompt //////////////////////////////////////
   //helper method 
   private static double getUserNumberInput()
      {
	   Scanner money = new Scanner(System.in);
	   return money.nextDouble();
      }
         
   //Prints the final record to the console by using data from the object //////////////////////////////////////
   private static void consoleRecordCheck(Customer c)
      {
 
      }
   }
