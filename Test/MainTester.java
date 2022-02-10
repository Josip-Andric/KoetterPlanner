
public class MainTester {
	
	static int broj = 5;
	static int [] proba = new int[broj];
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 0; i < proba.length; i ++) {
			proba[i] = 2 + i;
			System.out.println(proba[i]);
		}
		
		proba = new int [broj];
		
		for(int i = 0; i < proba.length; i ++) {
			System.out.println(proba[i]);
		}
		
	}

}
