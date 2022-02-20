
public class PlanRotation {
	
	static int[][] plan = TwoDimArray.plan;
	static int employees = TwoDimArray.employees;
	static int daysOfMonth = TwoDimArray.daysOfMonth;
	public static int[][] rotatedPlan = new int[employees][daysOfMonth];

	public static void rotate() {
		
		for(int i = 0; i < employees; i++) {
			for(int j = 0; j < daysOfMonth; j++) {
				
				rotatedPlan[i][j]=plan[j][i];
				
				
			}
			
			
		}
		
	
	}
	
	

}
