import java.util.ArrayList;

public class PastCounter {
	
	static int employees = TwoDimArray.employees;
	static int[][] plan = TwoDimArray.plan;
	
	
	static String [] pastCounter = new String[employees];
	static ArrayList<Integer> sortedCounter= new ArrayList<Integer>();
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
				
				pastCounter[j] = " " + counterInArray;
			}
			
			//COUNT PAST OFF DAYS
			
			if(plan[i-1][j] == 0) {
				counterInArray = counterInArray - 1;
				
				
				if(plan[i-2][j] == 0) {
					counterInArray = counterInArray - 1;
					
					
					if(plan[i-3][j] == 0) {
						counterInArray = counterInArray - 1;
						
						if(plan[i-4][j] == 0) {
							
							counterInArray = counterInArray - 1;
							
						}
						
					}
					
				}
				
				pastCounter[j] = counterInArray + "";
			}
			
			
			
			
			System.out.print(pastCounter[j] + " ");
			counterInArray = 0;
			
		}
		
		
		
		
	}
	
	public static void pastCounterSorter() {
		
		
		
		// -4
		
		for (int i = 0; i < pastCounter.length; i++) {
			
			if(pastCounter[i].equals("-4")) {
				
				sortedCounter.add(i);
			
				
			}
		}
		
		// -3
		
		for (int i = 0; i < pastCounter.length; i++) {
			
			if(pastCounter[i].equals("-3")) {
				
				sortedCounter.add(i);
			
				
			}
		}
		
		// - 2 
		
		for (int i = 0; i < pastCounter.length; i++) {
			
			if(pastCounter[i].equals("-2")) {

				sortedCounter.add(i);
				
			}
		}
		// - 1
		for (int i = 0; i < pastCounter.length; i++) {
	
			if(pastCounter[i].equals("-1")) {
		

				sortedCounter.add(i);
				
			}
		}
		
		// 1
		for (int i = 0; i < pastCounter.length; i++) {
	
			if(pastCounter[i].equals(" 1")) {
		

				sortedCounter.add(i);
		
				}
			}
		
		// 2
		
		for (int i = 0; i < pastCounter.length; i++) {
	
			if(pastCounter[i].equals(" 2")) {
		

				sortedCounter.add(i);
		
				}
			}
		
		//3
		for (int i = 0; i < pastCounter.length; i++) {
	
			if(pastCounter[i].equals(" 3")) {
		

				sortedCounter.add(i);
		
				}
			}
		
		// 4
		for (int i = 0; i < pastCounter.length; i++) {
	
			if(pastCounter[i].equals(" 4")) {
		

				sortedCounter.add(i);
				
				}
			}
		
		
		System.out.println("");
		
		System.out.print(sortedCounter);
		

	}
	
	
	

}
