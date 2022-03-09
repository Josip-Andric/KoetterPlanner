import java.util.ArrayList;

public class NightShifts {
	
	public static int [][] plan = BaseArray.plan;
	static int employees = TwoDimArray.employees;
	static int daysOfMonth = TwoDimArray.daysOfMonth;
	
	static ArrayList<Integer> freePeopleIndex= new ArrayList<Integer>();


	

	public static void add() {
		int max = 0;
		int min = 0;
		
		
		
		for(int j = 0; j < employees; j++) {
			
			if(plan[TwoDimArray.reference][j] == 0) {
				freePeopleIndex.add(j);
				
			}
			
			
		}
		
	
		
	// HARDCODED PART, NOT PROUD, Shoud be a loop but it keeps breaking
		
		max = freePeopleIndex.size() -1;
		
		int randomInt = (int)Math.floor(Math.random()*(max-min+1)+min);
			 
			 plan[TwoDimArray.reference][freePeopleIndex.get(randomInt)] = 2;
			 
			 
			 
		int	secondRandomInt = (int)Math.floor(Math.random()*(max-min+1)+min);
			 
			 if( secondRandomInt != randomInt) {
				 
				 plan[TwoDimArray.reference][freePeopleIndex.get(secondRandomInt)] = 2;
				 
			 }
			 else {
				 secondRandomInt = (int)Math.floor(Math.random()*(max-min+1)+min);
				 plan[TwoDimArray.reference][freePeopleIndex.get(secondRandomInt)] = 2;
				 
				 
			 }
			 
			 
			
			
		 
	
		

}
}
