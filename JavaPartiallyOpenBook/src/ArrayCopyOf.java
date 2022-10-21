import java.util.Scanner;
public class ArrayCopyOf {

	public static void main(String[] args) {
		int[] array=new int[5];
		int newsize;
		Scanner r=new Scanner(System.in);
		System.out.println("enter the size for the array :");
		newsize=r.nextInt();
		array=resize(array,newsize);
		System.out.println("the new array is : "+array.length);

	}
	public static int[] resize(int[] array,int size) {
		int[] copy=new int[size];
		if(array.length>size) {
			for(int i=0;i<size;i++) {
				copy[i]=array[i];
			}
		}else {
			for(int i=0;i<array.length;i++) {
				copy[i]=array[i];
			}
		}
		return copy;
	}

}
