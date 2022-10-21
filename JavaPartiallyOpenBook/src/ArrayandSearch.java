import java.util.Scanner;
public class ArrayandSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a =new int[100];
		Scanner r=new Scanner(System.in);
		System.out.println("enter the size of array : ");
		int b=r.nextInt();
		System.out.println("enter the array : ");
		for(int i=0;i<b;i++) {
			a[i]=r.nextInt();
		}
		search(a,b);

	}


public static void search(int[] a,int b) {
	for(int i=0;i<b;i++) {
		if(a[i]==-1) {
			break;
		}else {
			System.out.print(a[i]+" ");
		}
	}
	
}
}