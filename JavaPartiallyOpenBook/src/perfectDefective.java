package javapartialyopenbook2;
import java.util.Scanner;
public class perfectDefective {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int upperbound;

		int perfectNumCount = 0;
		String perfectNums = "";
		int deficientNumCount = 0;
		String deficientNums = "";
		int notPOrDNumCount = 0;
		String notPOrDNums = "";

		System.out.print("Enter the upper bound: ");
		upperbound = in.nextInt();

		for (int i = 1; i <= upperbound; i++) {
			if (isPerfect(i)) {
				perfectNums += i + " ";
				perfectNumCount++;
			} else if (isDeficient(i)) {
				deficientNums += i + " ";
				deficientNumCount++;
			} else {
				notPOrDNums += i + " ";
				notPOrDNumCount++;
			}
		}

		double perfectNumPercent = ((double)perfectNumCount / upperbound) * 100;
		System.out.println("These numbers are perfect: ");
		System.out.println(perfectNums);
		System.out.printf("%d perfect numbers found (%.2f)\n\n", perfectNumCount, perfectNumPercent);

		double deficientNumPercent = ((double)deficientNumCount / upperbound) * 100;
		System.out.println("These numbers are deficient: ");
		System.out.println(deficientNums);
		System.out.printf("%d perfect numbers found (%.2f)\n\n", deficientNumCount, deficientNumPercent);

		double notPOrDNumPercent = ((double)notPOrDNumCount / upperbound) * 100;
		System.out.println("These numbers are neither deficient nor perfect: ");
		System.out.println(notPOrDNums);
		System.out.printf("%d perfect numbers found (%.2f)", notPOrDNumCount, notPOrDNumPercent);

	}

	public static boolean isPerfect (int aPosInt) {
		int sumOfFactors = 0;

		for (int i = 1; i <= aPosInt / 2; i++) {
			if (aPosInt % i == 0) {
				sumOfFactors += i;
			}
		}

		if (sumOfFactors == aPosInt) {
			return true;
		}

		return false;
	}

	public static boolean isDeficient (int aPosInt) {
		int sumOfFactors = 0;

		for (int i = 1; i <= aPosInt / 2; i++) {
			if (aPosInt % i == 0) {
				sumOfFactors += i;
			}
		}

		if (sumOfFactors < aPosInt) {
			return true;
		}

		return false;
	}

	}


