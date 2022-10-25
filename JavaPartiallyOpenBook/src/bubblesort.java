package javapartialyopenbook2;
import java.util.Scanner;
public class bubblesort {

	public static void main(String[] args) {
		int[] a=new int[100];
		int n,temp;
		Scanner r=new Scanner(System.in);
		System.out.println("enter the size of array : ");
		n=r.nextInt();
		System.out.println("enter the numbers : ");
		for(int i=0;i<n;i++) {
			a[i]=r.nextInt();
		}
		for(int i=1;i<n;i++) {
			for(int j=0;j<n-i;++j) 
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			
			
			}
		System.out.println("array after bubble sort : ");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
			
		}

	}

}
