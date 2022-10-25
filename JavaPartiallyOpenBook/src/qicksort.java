package javapartialyopenbook2;

public class qicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {20, 11, 18, 14, 15, 9, 32, 5, 26};

		System.out.println("Array before Sort: ");
		printArray(array);

		quickSort(array, 0, array.length - 1);

		System.out.println("\nArray after sort: ");
		printArray(array);
	}

	public static void quickSort(int[] array, int fromIdx, int toIdx) {
		if (fromIdx >= toIdx) {
			return;
		}

		int pivotIndex = (fromIdx + toIdx) / 2;
		int pivot = array[pivotIndex];
		int swapPos = fromIdx;
		int finalPos = toIdx;

		int temp;
		while (swapPos <= finalPos) {
			while (array[swapPos] < pivot) {
				swapPos++;
			}

			while (array[finalPos] > pivot) {
				finalPos--;
			}

			if (swapPos <= finalPos) {
				temp = array[swapPos];
				array[swapPos] = array[finalPos];
				array[finalPos] = temp;

				swapPos++;
				finalPos--;
			}
		}

		pivotIndex = swapPos;

		quickSort(array, fromIdx, pivotIndex - 1);
		quickSort(array, pivotIndex, toIdx);

		return;

	}

	public static void quickSort(int[] array) {
		int fromIdx = 0;
		int toIdx = array.length - 1;

		quickSort(array, fromIdx, toIdx);
	}

	public static void printArray(int[] array) {
		System.out.print("The values are: [");
		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				System.out.print(array[i]);
			} else {
				System.out.print(", " + array[i]);
			}

		}
		System.out.println("]");
	}

	}


