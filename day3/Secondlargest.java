package week1.day3;

import java.util.Arrays;

public class Secondlargest {
	
	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7};
		
        Arrays.sort(data);
        int length = data.length;
        
        
        System.out.println("The second largest number is" + data [length-2]);
        
        
        

		
	}

}
