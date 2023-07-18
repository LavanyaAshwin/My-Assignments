package week1.day2;

public class Factorial {
	public static void main(String[] args) {
		
		int num= 10;
		int fact = 1;
		
		for(int x =1;x<=num;x++)
		{
			
			fact = fact * x ;
			System.out.println(fact);
		}
	}

}
