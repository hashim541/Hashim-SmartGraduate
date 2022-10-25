package javapartialyopenbook2;
import java.util.Scanner;
public class gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner in = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		a = in.nextInt();
		System.out.print("Enter the second integer: ");
		b = in.nextInt();

		int gcdResult = gcd(a, b);
		System.out.println("The gcd of " + a + " and " + b + " is: " + gcdResult);
	}

	public static int gcd(int a, int b) {
		int temp;
		while (b != 0) {
			temp = b;
			b = a % b;
			a = temp;
		}

		return a;
	}

	public static int gcdRecursive (int a, int b) {
		if (b == 0) {
			return a;
		}

		return gcd(b, a % b);

	}

}
