package week1.day2;

public class Fibonacci {
	public static void main(String[] args) {
		
		int n = 10;
		int firstNum = 0;
		int secondNum = 1;
	    System.out.println("Fibonacci Series till " + n + " terms:");

	    for (int i = 1; i <= n; ++i) {
	    	
	      int sum = firstNum + secondNum;
	      firstNum = secondNum;
	      secondNum = sum;
	      
	      System.out.print(firstNum + ", ");
	    }
	}

}
