package javapartialyopenbook2;

public class factorialint {

	public static void main(String[] args) {
		int i = 1;
		int fact = 1;
		while (Integer.MAX_VALUE / fact >= (i + 1)) {
			fact = factorial(i);
			System.out.println("The factorial of " + i + " is " + fact);
			++i;
		}

		System.out.println("The factorial of " + i + " is out of range");

	}
	public static int factorial (int n) {
		if (n < 2) {
			return 1;
		}

		return n * factorial(n - 1);

}
}
