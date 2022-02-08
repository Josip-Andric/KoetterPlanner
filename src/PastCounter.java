import java.util.ArrayList;


public class PastCounter {
	
	static int employees = TwoDimArray.employees;
	static int[][] plan = TwoDimArray.plan;
	
	
	static String [] pastCounter = new String[employees];
	static ArrayList<Integer> sortedCounterList= new ArrayList<Integer>();
	static int [] sortedCounter = new int[employees];
	
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
			
			
			
			
			//System.out.print(pastCounter[j] + " ");
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
		
		
		
//		System.out.print(sortedCounterList);
		System.out.println("");
		
		for(int i = 0; i < employees ; i++) {
			
			sortedCounter[i] = sortedCounterList.get(i);
		
		}
		
//		for(int i = 0; i < employees ; i++) {
//			System.out.print(sortedCounter[i] + " ");
//			
//		}

	}
	
	
	
	public static void shifftsAssigner() {
		
		for(int j =0; j < employees; j++) {
			
			if(j<9) {
				plan[i][sortedCounter[j]] = 1;
			}
			else {
				plan[i][sortedCounter[j]] = 0;
				
			}
			
		}
		
		
		
	}
	
	public static void arrayReseter() {
		
		
		//treba resetirati pastCounter i mozda i sortanu verziju te liste
		
		pastCounter = new String[0];
		sortedCounter = new int [0];
		sortedCounterList.clear();
		
	
	
	
}
	
	

}
