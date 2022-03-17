import java.util.ArrayList;
import java.util.Collections;

public class Translator {
	
	public static int employees = TwoDimArray.employees;
	public static int daysOfMonth = TwoDimArray.daysOfMonth;
	public static int[][] rotatedPlan = PlanRotation.rotatedPlan;
	
	public static String [] weekDaysShifts = Database.weekDaysShifts;
	
	
	public static String[][] stringPlan = new String [employees][daysOfMonth];
	
	
	static ArrayList<Integer> shiftsIndex = new ArrayList<Integer>();
	
	static ArrayList<String> shiftShuffle = new ArrayList<String>();
	
	
	
	

	public static void translateToString() {
		
		//TRANSLATE FREE DAYS
		
		for(int i = 0; i < employees; i++) {
			for(int j = 0; j < daysOfMonth; j++) {
				
				if(rotatedPlan[i][j]== 0) {
					stringPlan[i][j] = " X ";
				}
				else if(rotatedPlan[i][j]== 2) {
					stringPlan[i][j] = " N ";
				}
				
				else {
					stringPlan[i][j] = " S ";
				}
			
			}
		
		}
		
		
		
		
		
	}
	
		
	public static void translateDaysShifts() {
		
		
		
		//Shifts ADDED to ArrayList
		
		for(int i = 0; i < weekDaysShifts.length; i++) {
			shiftShuffle.add(weekDaysShifts[i]);
		}
		
		
		
		
		
		
		
		for(int i = 0; i < daysOfMonth; i++) {
			for(int j = 0; j < employees; j++) {
				
				
				//dodaje u shiftsIndex I od dnevnih smjena
			
			if(rotatedPlan[j][i] ==  1) {
				
				shiftsIndex.add(j);
			}
				
				
				
				
				
			}
			
			
			//shuffle listu sa smjenama iz baze podataka 
			Collections.shuffle(shiftShuffle);
			
			
			// treba upisivat dan za danom a ne radnika za radnikom, trebam zamjeniti  I i J
			
			
			for(int k = 0; k < shiftsIndex.size(); k++) {
				
				
				// 2d array gdje je I dan u mjesecu a k radnik
				
				
				stringPlan[shiftsIndex.get(k)][i] = shiftShuffle.get(k);
			}
			
			shiftsIndex.clear();
			
			
			
			
			
			
		}
			
		
		}
		
		
		
	
	
	
	
	
	
	
		
	
		
		
	
}
