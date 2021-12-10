

public class TwoDimArray {
	
	static int daysOfMonth = 30;
	static int employees = 20;
	
	
	
	
	public static int[][] plan = new int[daysOfMonth][employees];	
//	public static int[] baseArray = BaseArray.baseArray;
	
	public static void fillFirstFourDays() {
		
		
	
		for(int i = 0; i< 4; i++) {
			
			
			BaseArray.randomize();
			

			
			
			for(int j = 0; j < employees; j++) {
				
				plan[i][j] = BaseArray.baseArray[j];
				
				
			}
			
			
			BaseArray.resetBaseArray();
			BaseArray.posNum = 0;
			
			
		}
		
		}
		
	
	
	public static void printFourDaysArray() {
		
		for(int i = 0; i < 4; i++) {
			
			for(int j = 0; j < employees; j++) {
				
				System.out.print(plan[i][j] + "  ");
				
			}
			System.out.println(" ");
			
		}
		
		
	}
	
	public static void fillRestOfMonth() {
		for(int i = 4; i < daysOfMonth; i++) {
			
		PastCounter.shiftsCounter();
		
		PastCounter.pastCounterSorter();
		
		PastCounter.shifftsAssigner();
		
		for (int j = 0; j < employees; j++) {
				
				System.out.print(plan[i][j] + "  ");
			}
			System.out.println("");
		
		}
		PastCounter.arrayReseter();
	}
	
	
	
}
