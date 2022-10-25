package javapartialyopenbook2;

public class fatorialrecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(0));
		System.out.println(factorial(1));
		System.out.println(factorial(5));
		System.out.println(factorial(10));
	}

	public static int factorial(int n) {
		if (n < 2) {
			return 1;
		}

		return n * factorial(n - 1);

	}

}
