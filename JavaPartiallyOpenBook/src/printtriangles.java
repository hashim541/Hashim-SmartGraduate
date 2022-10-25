package javapartialyopenbook2;

public class printtriangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numRows = 8;

		System.out.println("\n\nPower Of Two Triangle: \n");
		printPowerOf2Triangle(numRows);
		System.out.println("\n\nPascal Triangle 1: \n");
		printPascalTriangle1(numRows);
		System.out.println("\n\nPascal Triangle 2: \n");
		printPascalTriangle2(numRows);

	}
	public static void printPowerOf2Triangle(int numRows) {
		for (int i = 1; i <= numRows; i++) {
			for (int j = 0; j < numRows - i; j++) {
				System.out.print("   ");
			}

			for (int k = 0; k < i; k++) {
				System.out.print((int)Math.pow(2, k) + "  ");
			}

			for (int l = 1; l < i; ++l) {
				System.out.printf("%2d ", (int)Math.pow(2, (i - l - 1)));
			} 
			System.out.println("\n");
		}

		System.out.println();
	}

	public static void printPascalTriangle1 (int numRows) {
		int value = 1;
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0 || i == 0) {
					value = 1;
				} else {
					value = value * (i - j + 1) / j;
				}
				System.out.printf("%2d ", value);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void printPascalTriangle2 (int numRows) {
		int value = 1;
		for (int i = 0; i < numRows; i++) {
			for (int s = 0; s < numRows - i; s++) {
				System.out.print("  ");
			}

			for (int j = 0; j <= i; j++) {
				if (j == 0 || i == 0) {
					value = 1;
				} else {
					value = value * (i - j + 1) / j;
				}
				System.out.printf("%4d ", value);
			}
			System.out.println();
		}
		System.out.println();
	}

}
