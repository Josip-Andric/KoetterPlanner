import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

public class GUI {
	
	
	public static int employees = TwoDimArray.employees;
	public static int daysOfMonth = TwoDimArray.daysOfMonth;
	public static int[][] rotatedPlan = PlanRotation.rotatedPlan;
	
	
	public static void generateGui() {
		
		
		String[] columnNames = new String[daysOfMonth];
		
		for(int i = 0; i < daysOfMonth; i++) {
			
			columnNames[i] = " 01";
			
		}
		
		Object[][] data = new Object[employees][daysOfMonth];
		
		for(int i = 0; i < employees; i++) {
			for(int j = 0; j < daysOfMonth; j++) {
				
				data[i][j] = rotatedPlan[i][j];
				
				
				
				
			}
			
			
		}
	    
	    
		
	//CONSTRUCT STUFF
	JFrame frame = new JFrame("example");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JButton button1 = new JButton("Generate");
	JButton button2 = new JButton("Export");
	
	
	
	JTable table = new JTable(data, columnNames);
	JPanel panel = new JPanel();
	
	
	
	
	
	
	
	
	//ADD STUFF TO FRAME
	
	panel.add(table, BorderLayout.CENTER);
	panel.add(button1);
	panel.add(button2);
	frame.add(panel);
	
	
	
	
	
	//LOOKS
	
	frame.setSize(1400,800);
	panel.setLayout(null);
	button1.setBounds(1250,730,100,20);
	button2.setBounds(50,730,100,20);
	
	table.setBounds(20, 10, 1370, 700);
	
	
	frame.setVisible(true);
	
	
	
	
	
	}
	
}

