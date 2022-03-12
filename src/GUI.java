import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

public class GUI {
	
	
	public static int employees = TwoDimArray.employees;
	public static int daysOfMonth = TwoDimArray.daysOfMonth;
	public static int[][] rotatedPlan = PlanRotation.rotatedPlan;
	
	
	static JFrame frame = new JFrame("example");
	
	static JPanel panel1 = new JPanel();
	
	static JPanel panel2 = new JPanel();
	
	static JTable table;
	
	
	public static void generateGui() {
		
		
		String[] columnNames = new String[daysOfMonth];
		
		for(int i = 0; i < daysOfMonth; i++) {
			
			columnNames[i] = "01";
			
		}
		
		Object[][] data = new Object[employees][daysOfMonth];
		
		for(int i = 0; i < employees; i++) {
			for(int j = 0; j < daysOfMonth; j++) {
				
				data[i][j] = rotatedPlan[i][j];
				
				
				
				
			}
			
			
		}
	    
	    
		
	//CONSTRUCT STUFF
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JButton button1 = new JButton("Generate");
	JButton button2 = new JButton("Export");
	
	
	
	
	
	table = new JTable(data, columnNames);
	
	
	
	
	
	//ADD STUFF TO FRAME
	
	panel1.add(table, BorderLayout.CENTER);
	panel2.add(button1);
	panel2.add(button2);
	frame.add(panel1);
	frame.add(panel2);
	
	
	
	
	
	
	//LOOKS
	
	frame.setSize(1400,800);
	panel1.setLayout(null);
	panel1.setBounds(20, 10, 1370, 700);
	
	panel2.setLayout(null);
	panel2.setBounds(20, 700, 1370, 700);
	

	button1.setBounds(1250,730,100,20);
	button2.setBounds(50,730,100,20);
	
	table.setBounds(20, 10, 1370, 700);
	table.setFont(new Font("Helvetica", Font.CENTER_BASELINE, 20));
	table.setRowHeight(table.getRowHeight() + 18);
	
	
	
	button1.addActionListener(new Action());
	
	
	
	
	frame.setVisible(true);
	
	
	
	
	
	}
	
	public static void generateTable() {
		
		panel1.remove(table);
		
		
		String[] columnNames = new String[daysOfMonth];
		
		for(int i = 0; i < daysOfMonth; i++) {
			
			columnNames[i] = "01";
			
		}
		
		Object[][] data = new Object[employees][daysOfMonth];
		
		for(int i = 0; i < employees; i++) {
			for(int j = 0; j <daysOfMonth; j++) {
				
				data[i][j] = rotatedPlan[i][j];
				
				
				
				
			}
			
			
		}
		
		
		
		table = new JTable(data, columnNames);
		
		
		panel1.setLayout(null);
		panel1.setBounds(20, 10, 1370, 700);

		
		
		panel1.add(table, BorderLayout.CENTER);
		
		table.setRowHeight(34);
		
		table.setBounds(20, 10, 1370, 700);
		table.setFont(new Font("Helvetica", Font.CENTER_BASELINE, 20));
		
		
		
		
		
		
	}
	
	
}


class Action implements ActionListener{
	

	public static int employees = TwoDimArray.employees;
	public static int daysOfMonth = TwoDimArray.daysOfMonth;
	public static int[][] rotatedPlan = PlanRotation.rotatedPlan;
	

	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		TwoDimArray.fillFirstFourDays();
		
		
		TwoDimArray.fillRestOfMonth();
		
		PlanRotation.rotate();
        
        PrintRotatedPlan.print();
        
        GUI.generateTable();
        
        System.out.println("Clicked!");
        
        
       
		
      
		
		
		
        
        
       
				
				
		
	    
		
		
		
	}


}

