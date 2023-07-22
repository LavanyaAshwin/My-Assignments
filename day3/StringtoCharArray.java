package week1.day3;

public class StringtoCharArray {
	
	public static void main(String[] args) {
		
		String test = "changeme";
		
		char[] change = test.toCharArray();
		
		for(int i=0;i<test.length();i++) {
			
			if(i%2!=0) {
				
			
				System.out.println(Character.toUpperCase(change[i]));
				}
			
			else {
				System.out.println(Character.toLowerCase(change[i]));
			}
		}
		
	}

}
