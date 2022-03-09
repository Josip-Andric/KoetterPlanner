import java.util.ArrayList;

public class BaseArray {
	
	public static int[][] plan = TwoDimArray.plan;
	
	public static int employees = TwoDimArray.employees;
	
	public static int[] baseArray = new int[employees];
	
	public static int posNum; 
	
	public static int wantedPos;
	
	public static int randomInt = 0;
	
	public static int[] january = Database.january;
	
	static ArrayList<Integer> freePeopleIndex= new ArrayList<Integer>();
	
	
	
	
	public static void fill() {
		
		for (int j = 0; j < employees; j++) {
			
			baseArray[j] = 0;
			
			
		}
		
	}
	
	public static void randomize() {
		int min = 0;
		int max = employees - 1;
	
		
		while(posNum < wantedPos) {
			
			posNum = 0;
		
		 randomInt = (int)Math.floor(Math.random()*(max-min+1)+min);
	   
		
		if(baseArray[randomInt] == 0) {
			
			baseArray[randomInt] = 1;
		}
		
		
		for(int k = 0; k < employees; k++) {
			
			if(baseArray[k] == 1) {
				posNum ++;
			}
			
			
		}
		
		
		
		}
		
	}
	
	public static void nightShiftsAssign() {
		int max = 0;
		int min = 0;
		
		for (int j = 0; j < employees; j++) {
			
			System.out.print(baseArray[j]);
			
			}
		
		for(int j = 0; j < employees; j++) {
			
			if(baseArray[j] == 0) {
				freePeopleIndex.add(j);
				
			}
			
			
		}
		
		max = freePeopleIndex.size() -1;
		
		int randomInt = (int)Math.floor(Math.random()*(max-min+1)+min);
			 
			 baseArray[freePeopleIndex.get(randomInt)] = 2;
			 
			 
			 
		int	secondRandomInt = (int)Math.floor(Math.random()*(max-min+1)+min);
			 
			 if( secondRandomInt != randomInt) {
				 
				 baseArray[freePeopleIndex.get(secondRandomInt)] = 2;
				 
			 }
			 else {
				 secondRandomInt = (int)Math.floor(Math.random()*(max-min+1)+min);
				 baseArray[freePeopleIndex.get(secondRandomInt)] = 2;				 
				 
			 }
			 
			 
			
		 
		
		
		
	}
	public static void resetBaseArray(){
		
			for (int j = 0; j < employees; j++) {
			
				baseArray[j] = 0;
		
			}
			freePeopleIndex.clear();
		
		
	}

	public static void print() {
		
	}

	

}
