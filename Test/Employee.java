

public class Employee {

	
	
	private String name;
	private boolean canWorkNightShift;
	private boolean hasFireEducation;
	private boolean canWorkAtGPA;
	private int daysInRowLastMonth;
	public int daysInRowFree;
//	private boolean[] isActive;
	
	public Employee(String name, boolean nightShift, boolean fire, boolean gpa) {
		this.name = name;
		this.canWorkNightShift = nightShift;
		this.hasFireEducation = fire;
		this.canWorkAtGPA = gpa;
	}
	
	public boolean isAvailableForDay(int day) {
		if (day <= 3) {
			if (daysInRowLastMonth == 4) {
				return false;
			}
		}
		
		return true;
	}
	
	public void debug() {
		System.out.println("Employee: " + name);
		System.out.println("- can work night shift: " + canWorkNightShift);
		System.out.println("- has fire educaiton: " + hasFireEducation);
		System.out.println("- can work at GPA: " + canWorkAtGPA);
	}
	
	public String getName() {
		return name;
	}
	
	public boolean canWorkNightShift() {
		return canWorkNightShift;
	}
	
	public boolean hasFireEducation() {
		return hasFireEducation;
	}
	
	public boolean canWorkAtGPA() {
		return canWorkAtGPA;
	}
}
