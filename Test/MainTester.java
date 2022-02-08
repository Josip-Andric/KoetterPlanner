
public class MainTester {
	
	static int [] proba = {1,2,2,2,2,2,2,};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 0; i < proba.length; i ++) {
			System.out.println(proba[i]);
		}
		
		proba = new int [0];
		
		for(int i = 0; i < proba.length; i ++) {
			System.out.println(proba[i]);
		}
		
	}

}
