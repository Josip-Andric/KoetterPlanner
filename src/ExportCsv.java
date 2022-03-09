import java.io.FileWriter;
import java.io.IOException;

public class ExportCsv {

	static int[][] plan = TwoDimArray.plan;
	static int employees = TwoDimArray.employees;
	static int daysOfMonth = TwoDimArray.daysOfMonth;

	static int [][]rotatedPlan = PlanRotation.rotatedPlan;
	
	
	public static void run() throws IOException{
		
		
		 FileWriter writer = new FileWriter("/Users/josipandric/Desktop/CSV Test/TestCsv.txt");

		for(int i = 0; i < employees; i++) {
			 
			 for(int j = 0; j < daysOfMonth; j++) {
				
			 
			 writer.append(rotatedPlan[i][j] + "");
			 writer.append(";");
			 
			 }
			 
			 writer.append("\n");
			 writer.append("\n");
			 
			 
		}
			 
			 
			 writer.flush();
			 writer.close();
			 
	
			 
			 System.out.println("Successfully wrote to the file.");
			 
	}

}
