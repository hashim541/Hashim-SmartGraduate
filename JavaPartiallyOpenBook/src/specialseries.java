package javapartialyopenbook2;

public class specialseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(specialSeries(1, 3));

	}

	public static double specialSeries(double x, int numTerms) {
		double result = 0.0;

		for (int i = 0; i < numTerms; i++) {
			result += calculateTerm(x, i);
		}

		return result;

	}

	public static double calculateTerm (double x, int n) {
		double term = 1.0;
		double power = 2*n + 1;

		if (n == 0) {
			return x;
		}

		for (int i = 0; i <= n; i++) {
			if (i == n) {
				term *= Math.pow(x, power) / power;
				break;
			}
			term *= (double)(i + 1) / (i + 2);
		}

		return term;
	}

}
