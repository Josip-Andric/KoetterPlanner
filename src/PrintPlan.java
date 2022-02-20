
public class PrintPlan {
	
	
	static int[][] plan = TwoDimArray.plan;
	static int employees = TwoDimArray.employees;
	static int daysOfMonth = TwoDimArray.daysOfMonth;

	public static void print() {
		
for(int i =0; i< daysOfMonth; i++) {
			
			for(int j =0; j < employees; j++) {
				
				System.out.print(plan[i][j] + "  ");
				
				
				
			}
			System.out.println("");
			System.out.println("");
			
		}
		
		
		
		
	}

}
