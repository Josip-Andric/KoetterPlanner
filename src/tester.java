import java.util.Arrays;

public class tester {
	
	public static String[] pastCounter = {"3F", "4F", "1F", "2A", "2A", "1A",
	                                                "1A", "1F", "1F", "4F", "1A", "3A",
	                                                "2A", "2F", "3F", "3F", "1A", "1F",
	                                                "4F", "2A"};
	
	
	public static void test() {

		Arrays.sort(pastCounter,
	            (String a, String b) -> a.length() - b.length());
		
		
	
	}
}
