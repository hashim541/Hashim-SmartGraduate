
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 20;
		 int factorial = 1; 
		 // n! = 1*2*3...*n
		 for (int i = 1; i <= n; i++) { // i = 1, 2, 3, ..., n
		 factorial = factorial * i; 
		 } 
		 System.out.println("The Factorial of " + n + " is " + factorial);

	}

}
