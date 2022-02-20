
public class HoursCounter {
	
	static int[][] plan = TwoDimArray.plan;
	static int employees = TwoDimArray.employees;
	static int daysOfMonth = TwoDimArray.daysOfMonth;
	static int hours = 0;
	static int []hoursArray = new int[employees];
	
	public static void counter() {
		//System.out.println("");
		
		for(int j = 0; j < employees; j ++ ) {
			
			for(int i =0; i < daysOfMonth; i ++) {
				
				if(plan[i][j] == 1) {
					hours = hours + 12;
					
				}
				
				
				
			}
			
//			System.out.print(hours);
//			System.out.print(" ");
			hours = hoursArray[j];
			hours = 0;
			
			
			
		}
		
		
		
	}
	
	

}
