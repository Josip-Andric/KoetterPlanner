
public class Database {
	private static int[] canWorkGPA = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
	private static int[] canWorkTAG = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
	private static int[] canWorkNACHT = {0,1,1,1,1,0,1,0,1,1,1,0,1,1,0,1,1,0,1,1};
	public static int[] january = {1,1,0,0,0,0,0,1,1,0,0,0,0,0,1,1,0,0,0,0,0,1,1,0,0,0,0,0,1,1};

	public static int[] getCanWorkTAG() {
		return canWorkTAG;
	}

	public static int[] getCanWorkNACHT() {
		return canWorkNACHT;
	}

	public static int[] getCanWorkGPA() {
		return canWorkGPA;
	}
	
	

}
