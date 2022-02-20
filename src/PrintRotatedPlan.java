
public class PrintRotatedPlan {
	
	static int[][] plan = TwoDimArray.plan;
	static int employees = TwoDimArray.employees;
	static int daysOfMonth = TwoDimArray.daysOfMonth;
	static int[][] rotatedPlan = PlanRotation.rotatedPlan;

	public static void print() {
		
		
		for(int i =0; i< employees; i++) {
			
			for(int j =0; j < daysOfMonth; j++) {
				
				System.out.print(rotatedPlan[i][j] + "   ");
				
				
				
			}
			System.out.println("");
		
			
		}
		
		
		
	}

}
