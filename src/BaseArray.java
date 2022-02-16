
public class BaseArray {
	
	public static int[][] plan = TwoDimArray.plan;
	
	public static int[] baseArray = new int[20];
	
	public static int posNum = 0; 
	
	public static int randomInt = 0;
	
	public static void fill() {
		
		for (int j = 0; j < 20; j++) {
			
			baseArray[j] = 0;
			
			
		}
		
	}
	
	public static void randomize() {
		int min = 0;
		int max = 19;
	
		
		while(posNum < 9) {
			
			posNum = 0;
		
		 randomInt = (int)Math.floor(Math.random()*(max-min+1)+min);
	   
		
		if(baseArray[randomInt] == 0) {
			
			baseArray[randomInt] = 1;
		}
		
		
		for(int k = 0; k < 20; k++) {
			
			if(baseArray[k] == 1) {
				posNum ++;
			}
			
			
		}
		
		
		
		}
		
	}
	public static void resetBaseArray(){
		
			for (int j = 0; j < 20; j++) {
			
				baseArray[j] = 0;
		
			}
		
		
	}

	public static void print() {
		for (int j = 0; j < 20; j++) {
		
		System.out.print(baseArray[j]);
		
		}
	}

}
