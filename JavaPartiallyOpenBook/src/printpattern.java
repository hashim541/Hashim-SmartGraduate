package javapartialyopenbook2;

public class printpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 8;

		System.out.println("\n\nPattern A: \n");
		printPatternA(size);
		System.out.println("\n\nPattern B: \n");
		printPatternB(size);
		System.out.println("\n\nPattern C: \n");
		printPatternC(size);
		System.out.println("\n\nPattern D: \n");
		printPatternD(size);
		System.out.println("\n\nPattern E: \n");
		printPatternE(size);
		System.out.println("\n\nPattern F: \n");
		printPatternF(size);
		System.out.println("\n\nPattern G: \n");
		printPatternG(size);
		System.out.println("\n\nPattern H: \n");
		printPatternH(size);
		System.out.println("\n\nPattern I: \n");
		printPatternI(size);
		System.out.println("\n\nPattern J: \n");
		printPatternJ(size);
		System.out.println("\n\nPattern K: \n");
		printPatternK(size);
		System.out.println("\n\nPattern L: \n");
		printPatternL(size);

	}

	public static void printPatternA (int size) {
		for (int i = size; i >= 1; i--) {
			for (int j = 0; j < size - i; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k < i; k++) {
				System.out.print("# ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void printPatternB (int size) {
		for (int i = 1; i <= size; i++) {
			for (int j = 0; j < size - i; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k < i; k++) {
				System.out.print("# ");
			}
			System.out.println();
		}

		System.out.println();
	}

	public static void printPatternC (int size) {
		for (int i = 1; i <= size; i++) {
			for (int j = 0; j < size - i; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k < i; k++) {
				System.out.print("# ");
			}
			System.out.println();
		}

		for (int i = size - 1; i >= 1; i--) {
			for (int j = 0; j < size - i; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k < i; k++) {
				System.out.print("# ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void printPatternD (int size) {
		for (int i = 1; i <= size; ++i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print(j + " ");
			} 
			System.out.println("\n");
		}
		System.out.println();
	}

	public static void printPatternE (int size) {
		for (int i = size; i >= 1; --i) {
			for (int j = size; j > i; j--) {
				System.out.print("  ");
			}

			for (int k = 1; k <= i; ++k) {
				System.out.print(k + " ");
			} 
			System.out.println("\n");
		}
		System.out.println();
	}

	public static void printPatternF (int size) {
		for (int i = 1; i <= size; i++) {
			for (int j = 0; j < size - i; j++) {
				System.out.print("  ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print((i - k + 1) + " ");
			}
			System.out.println("\n");
		}

		System.out.println();
	}

	public static void printPatternG (int size) {
		for (int i = size; i >= 1; --i) {
			for (int j = 1; j <= i; ++j) {
				System.out.printf("%d ", (i - j) + 1);
			} 
			System.out.println("\n");
		}

		System.out.println();
	}

	public static void printPatternH (int size) {
		for (int i = 1; i <= size; i++) {
			for (int j = 0; j < size - i; j++) {
				System.out.print("  ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}

			for (int l = 2; l <= i; ++l) {
				System.out.printf("%d ", (i - l) + 1);
			} 
			System.out.println("\n");
		}

		System.out.println();
	}

	public static void printPatternI (int size) {
		for (int i = size; i >= 1; --i) {
			for (int j = size; j > i; j--) {
				System.out.print("  ");
			}

			for (int k = 1; k <= i; ++k) {
				System.out.print(k + " ");
			} 

			for (int l = 2; l <= i; ++l) {
				System.out.printf("%d ", (i - l) + 1);
			} 
			System.out.println("\n");
		}

		System.out.println();
	}

	public static void printPatternJ (int size) {
		int last;
		for (int i = 1; i <= size; ++i) {
			last = i;
			for (int j = 1; j <= i; ++j) {
				System.out.print(j + " ");
			} 

			for (int l = 0; l < 2 * (size - i) - 1; l++) {
				System.out.print("  ");
			}

			if (i == size) {
				last = i - 1;
			}
			for (int k = last; k >= 1; k--) {
				System.out.print(k + " ");
			}
			System.out.println("\n");
		}
		System.out.println();
	}

	public static void printPatternK (int size) {
		int last;
		for (int i = size; i >= 1; --i) {
			last = i;
			for (int k = 1; k <= i; ++k) {
				System.out.print(k + " ");
			} 

			for (int j = 0; j < 2 * (size - i) - 1; j++) {
				System.out.print("  ");
			}

			if (i == size) {
				last = i - 1;
			}
			for (int k = last; k >= 1; --k) {
				System.out.print(k + " ");
			} 
			System.out.println("\n");
		}

		System.out.println();
	}

	public static void printPatternL (int size) {
		int count;
		for (int i = 1; i <= size; i++) {
			for (int j = 0; j < size - i; j++) {
				System.out.print("  ");
			}

			count = i;
			for (int k = 1; k <= i; k++) {
				if (count == 10) {
					count = 0;
				}
				System.out.print(count + " ");
				count++;
			}

			count = (2 * i) - 2;
			for (int k = 1; k < i; k++) {
				if (count < 0) {
					count = 9;
				} else if (count > 10) {
					count -= 10;
				}
				System.out.print(count + " ");
				count--;
			}
			System.out.println("\n");
		}

		System.out.println();

}
}
