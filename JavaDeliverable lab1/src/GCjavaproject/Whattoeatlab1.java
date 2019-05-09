package GCjavaproject;

import java.util.Scanner;

public class Whattoeatlab1 {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		String eventType = new String();
		int partySize;
		String result = new String();
		
		System.out.println("Please choose the event type.");
		  eventType = scnr.nextLine();
		  
		System.out.println("Please enter the party size.");
		partySize = scnr.nextInt();
		
		result = "Hosting a " + eventType + " event and the party size  of " + partySize + " participants.";
		
	    result = result + " The Meal served is ";
	    
	    if (eventType.contains("casual"))                                 
	    	result  =   result + " Sandwiches ";                     
	    	
	    else if  (eventType.contains("semi-formal")) 
	       result =  result + "fried chicken";       
	    	
	     else if  (eventType.contains("formal")) 
	    	result= result + " chicken parmesan ";           
	    	
	       result = result + " prepared ";
	     
	     if (partySize == 1 ) 
	    	 result = result + " in the microwave.";
	    	 
	      else if ( (partySize >=2 && partySize <=12)) 
	    	result = result + " in your kitchen.";
	    	 
	      if (partySize > 12 ) 
	    	 result = result + " by a caterer.";
	        System.out.println(result);
	     
	      }
	     
	     
	        }
		
		   


