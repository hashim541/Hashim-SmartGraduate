package javapartialyopenbook2;

public class trignometricsreies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double piBy2 = Math.PI / 2;
		
		System.out.println("sin value: " + Math.sin(0));
		System.out.println(sin(0, 10));
		System.out.println("cos value: " + Math.cos(0));
		System.out.println(cos(0, 6));

	}
	public static double sin (double x, int numTerms) {
		double result = 0.0;
		int count = 1;
		for (int i = 1; i <= numTerms; i+=2) {
			if (count % 2 == 0)
				result -= calculateTerm(x, i);
			else
				result += calculateTerm(x, i);

			count++;
		}

		return result;
	}

	public static double cos (double x, int numTerms) {
		double result = 0.0;
		int count = 1;
		for (int i = 0; i <= numTerms; i+=2) {
			if (count % 2 != 0)
				result += calculateTerm(x, i);
			else
				result -= calculateTerm(x, i);

			count++;
		}

		return result;
	}

	public static double calculateTerm (double x, int n) {
		double term = 1.0;

		if (n == 0) {
			return 1.0;
		}

		for (int i = 0; i < n; i++) {
			term *= x / (n - i);
		}

		return term;
	}

}
