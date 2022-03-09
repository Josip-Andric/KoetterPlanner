import java.util.ArrayList;


public class PastCounter {
	
	static int employees = TwoDimArray.employees;
	static int[][] plan = TwoDimArray.plan;
	

	
	
	static String [] pastCounter = new String[employees];
	static ArrayList<Integer> sortedCounterList= new ArrayList<Integer>();
	static int [] sortedCounter = new int[employees];
	static int [] finishedDayArray = new int [employees];
	
	static int counterInArray = 0;
	
	
	
	
	public static void shiftsCounter() {
		
		
		
		for(int j = 0; j < employees; j++) {
			
			
			// COUNT PAST WORK DAYS
		
			
			
			if(plan[TwoDimArray.reference-1][j] == 1 || plan[TwoDimArray.reference-1][j] == 2) {
				counterInArray = counterInArray + 1;
				
				
				if(plan[TwoDimArray.reference-1][j] == 1 || plan[TwoDimArray.reference-1][j] == 2) {
					counterInArray = counterInArray + 1;
					
					
					if(plan[TwoDimArray.reference-1][j] == 1 || plan[TwoDimArray.reference-1][j] == 2) {
						counterInArray = counterInArray + 1;
						
						if(plan[TwoDimArray.reference-1][j] == 1 || plan[TwoDimArray.reference-1][j] == 2) {
							
							counterInArray = counterInArray + 1;
							
						}
						
					}
					
				}
				
				pastCounter[j] = " " + counterInArray;
			}
			
			//COUNT PAST OFF DAYS
			
			if(plan[TwoDimArray.reference-1][j] == 0) {
				counterInArray = counterInArray - 1;
				
				
				if(plan[TwoDimArray.reference-2][j] == 0) {
					counterInArray = counterInArray - 1;
					
					
					if(plan[TwoDimArray.reference-3][j] == 0) {
						counterInArray = counterInArray - 1;
						
						if(plan[TwoDimArray.reference-4][j] == 0) {
							
							counterInArray = counterInArray - 1;
							
						}
						
					}
					
				}
				
				pastCounter[j] = counterInArray + "";
			}
			
			
			
			
			
			counterInArray = 0;
			
		}
		
	
		
		
	}
	
	public static void pastCounterSorter() {
		
		
		
		// -4
		
		for (int i = 0; i < pastCounter.length; i++) {
			
			if(pastCounter[i].equals("-4")) {
				
				sortedCounterList.add(i);
			
				
			}
		}
		
		// -3
		
		for (int i = 0; i < pastCounter.length; i++) {
			
			if(pastCounter[i].equals("-3")) {
				
				sortedCounterList.add(i);
			
				
			}
		}
		
		// - 2 
		
		for (int i = 0; i < pastCounter.length; i++) {
			
			if(pastCounter[i].equals("-2")) {

				sortedCounterList.add(i);
				
			}
		}
		// - 1
		for (int i = 0; i < pastCounter.length; i++) {
	
			if(pastCounter[i].equals("-1")) {
		

				sortedCounterList.add(i);
				
			}
		}
		
		// 1
		for (int i = 0; i < pastCounter.length; i++) {
	
			if(pastCounter[i].equals(" 1")) {
		

				sortedCounterList.add(i);
		
				}
			}
		
		// 2
		
		for (int i = 0; i < pastCounter.length; i++) {
	
			if(pastCounter[i].equals(" 2")) {
		

				sortedCounterList.add(i);
		
				}
			}
		
		//3
		for (int i = 0; i < pastCounter.length; i++) {
	
			if(pastCounter[i].equals(" 3")) {
		

				sortedCounterList.add(i);
		
				}
			}
		
		// 4
		for (int i = 0; i < pastCounter.length; i++) {
	
			if(pastCounter[i].equals(" 4")) {
		

				sortedCounterList.add(i);
				
				}
			}
		
		
		
		
		
		for(int i = 0; i < employees ; i++) {
			
			sortedCounter[i] = sortedCounterList.get(i);
		
		}
		

	}
	
	
	
	public static void shifftsAssigner() {
		
		for(int j =0; j < employees; j++) {
			
			if(j<BaseArray.wantedPos) {
				finishedDayArray[sortedCounterList.get(j)] = 1;
			}
			else {
				finishedDayArray[sortedCounterList.get(j)]  = 0;
				
			}
			
			
		}
		

		
		for(int j = 0; j < employees; j++) {
			
			
			
			plan[TwoDimArray.reference][j] = finishedDayArray[j];
		}
		//System.out.println(" ");
		
	}
	
	
	
	public static void arrayReseter() {
		
		
		//treba resetirati pastCounter i mozda i sortanu verziju te liste
		
		// VALIDNI NACIN RESETIRANJA ARRAYS
		
		
		pastCounter = new String[employees];
		sortedCounter = new int [employees];
		finishedDayArray = new int [employees];
		sortedCounterList.clear();
		NightShifts.freePeopleIndex.clear();
		
	
	
	
}
	
	

}
