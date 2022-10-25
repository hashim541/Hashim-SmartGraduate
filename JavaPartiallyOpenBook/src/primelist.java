package javapartialyopenbook2;
import java.util.Scanner;
public class primelist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int upperbound;
		int primeCount = 0;
		Scanner in = new Scanner(System.in);

		System.out.print("Please enter the upper bound: ");
		upperbound = in.nextInt();

		for (int i = 1; i <= upperbound; i++) {
			if (isPrime(i)) {
				System.out.println(i);
				primeCount++;
			}
		}

		double primePercent = ((double)primeCount / upperbound) * 100;
		System.out.printf("[%d primes found (%.2f)]", primeCount, primePercent);
	}

	public static boolean isPrime(int n) {
		int count = 0;

		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				count++;
			}
		}

		if (count == 1) {
			return true;
		}

		return false;

	}

}
