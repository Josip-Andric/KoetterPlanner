
import java.util.ArrayList;
import java.util.*;

public class TwoDimensionalArrayOld {

	public static void generate() {
		
		//LIST OF CHOICES
		
		String[] weekDays = {"XS1", " S1", "XS5", "XS7", "XS8", "ST1", "EPZ", "SN1", "SN2" , "WA1", 
				"WA2", " X ", " X ", " X ", " X ", " X ", " X ", " X ", " X ", " X "};
	
	    final int NUMBER_OF_DAYS = 31;
	    
		ArrayList<ArrayList<String>> daysOfMonth = new ArrayList<ArrayList<String>>();
		
		//ARRAY FOR EACH DAY IN THE MONTH
		
		for (int i = 0; i < NUMBER_OF_DAYS; i++)
		{
		    ArrayList<String> day = new ArrayList<String>();
		    Collections.addAll(day, weekDays);
		    Collections.shuffle(day);
		    
		    daysOfMonth.add(day);
		}
		

		
		// STORE TO ARRAY
	    
	    String[][] raspored = new String[20][NUMBER_OF_DAYS];
	    
	    for (int i = 0; i < daysOfMonth.size(); i++) 
	    {
	        ArrayList<String> day = daysOfMonth.get(i);
	        
	        for (int j = 0; j < day.size(); j++) 
	        {
	            raspored[j][i] = day.get(j);
	        }
	    }
	    
	    
	    //PRINT OUT THE ARRAY / CALCULATE WORKING HOURS
	    int hoursWorked = 0;
	    int [] hours = new int[20];
	    
	    for (int i = 0; i < weekDays.length; i++) 
	    {
	        for (int j = 0; j < NUMBER_OF_DAYS; j++)
	        {
	            System.out.print(raspored[i][j] + " | ");
	            
	           if(raspored[i][j] == "XS1"||
	        		   raspored[i][j] == "XS5"||
	        		   raspored[i][j] == "XS7"||
	        		   raspored[i][j] == "XS8"||
	        		   raspored[i][j] == "ST1"||
	        		   raspored[i][j] == "EPZ"||
	        		   raspored[i][j] == " S1"||
	        		   raspored[i][j] == "SN1"||
	        		   raspored[i][j] == "SN2"||
	        		   raspored[i][j] == "WA1"||
	        		   raspored[i][j] == "WA2") {
	        	   hoursWorked = hoursWorked + 12;
	           }
	            
	            
	            
	        }
	        hours[i] = hoursWorked;
	        System.out.print(hoursWorked);
	        System.out.println();
	        hoursWorked = 0;
	    }
	    
	    for(int i =0; i<hours.length; i++) {
	    	System.out.print(hours[i] + " ");
	    }
	  
	    
	    
	}

    

}


