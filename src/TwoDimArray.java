

public class TwoDimArray {
	
	static int daysOfMonth = 30;
	static int employees = 20;
	
	
	
	
	public static int[][] plan = new int[daysOfMonth][employees];	
//	public static int[] baseArray = BaseArray.baseArray;
	public static int reference = 0;
	
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
			
			reference = i;
			
		PastCounter.shiftsCounter();
		
		// Pregledava dane unazad i zbraja koliko ima smjena odradjenih
		
		PastCounter.pastCounterSorter();
		
		// sortira listu koju shiftsCounter napravi
		
		PastCounter.shifftsAssigner();
		
		// prvih 9 u sortiranoj listi dobivaju SMJENU (1)
		
		for (int j = 0; j < employees; j++) {
				
				System.out.print(plan[i][j] + "  ");
			}
			//System.out.println("");
		
		PastCounter.arrayReseter();
		
		// resetira listu "sortedCounterList" 
		
		}
		
	}
	
	
	
}
