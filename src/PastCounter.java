
public class PastCounter {
	
	static int employees = TwoDimArray.employees;
	static int[][] plan = TwoDimArray.plan;
	
	
	static String [] pastCounter = new String[employees];
	static int counterInArray = 0;
	static int i = 4;
	
	
	
	public static void shiftsCounter() {
		
		
		
		for(int j = 0; j < employees; j++) {
			
			
			// COUNT PAST WORK DAYS
			
			if(plan[i-1][j] == 1) {
				counterInArray = counterInArray + 1;
				
				
				if(plan[i-2][j] == 1) {
					counterInArray = counterInArray + 1;
					
					
					if(plan[i-3][j] == 1) {
						counterInArray = counterInArray + 1;
						
						if(plan[i-4][j] == 1) {
							
							counterInArray = counterInArray + 1;
							
						}
						
					}
					
				}
				
				pastCounter[j] = counterInArray + "A";
			}
			
			//COUNT PAST OFF DAYS
			
			if(plan[i-1][j] == 0) {
				counterInArray = counterInArray + 1;
				
				
				if(plan[i-2][j] == 0) {
					counterInArray = counterInArray + 1;
					
					
					if(plan[i-3][j] == 0) {
						counterInArray = counterInArray + 1;
						
						if(plan[i-4][j] == 0) {
							
							counterInArray = counterInArray + 1;
							
						}
						
					}
					
				}
				
				pastCounter[j] = counterInArray + "F";
			}
			
			
			
			
			System.out.print(pastCounter[j] + " ");
			counterInArray = 0;
			
		}
		
		
		
		
	}
	
	
	

}
