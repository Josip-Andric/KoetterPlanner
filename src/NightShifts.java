import java.util.ArrayList;

public class NightShifts {
	
	public static int [][] plan = BaseArray.plan;
	static int employees = TwoDimArray.employees;
	static int daysOfMonth = TwoDimArray.daysOfMonth;
	
	static ArrayList<Integer> freePeopleIndex= new ArrayList<Integer>();

	

	public static void add() {
		int max = freePeopleIndex.size() - 1;
		int min = 0;
		int nPos = 2;
		
		for(int j = 0; j < employees; j++) {
			
			if(plan[TwoDimArray.reference][j] == 0) {
				freePeopleIndex.add(j);
				
			}
			
		}
		 while(freePeopleIndex.size() > nPos) {
		int randomInt = (int)Math.floor(Math.random()*(max-min+1)+min);
		
			freePeopleIndex.remove(randomInt);		
		 }
		 
		 for(int j = 0; j< freePeopleIndex.size(); j++) {
			 
			 plan[TwoDimArray.reference][freePeopleIndex.get(j)] = 0;
		 
	}

}
}
