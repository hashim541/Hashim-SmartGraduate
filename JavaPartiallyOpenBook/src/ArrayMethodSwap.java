package javapartialyopenbook2;
import java.util.Scanner;
public class ArrayMethodSwap {

	public static void main(String[] args) {
		int[] a=new int[100];
		int[] b=new int[100];
		Scanner r=new Scanner(System.in);
		System.out.println("enter the size of first array:");
		int c=r.nextInt();
		System.out.println("enter the first array:");
		for(int i=0;i<c;i++) {
			a[i]=r.nextInt();}
		System.out.println("enter the size of second array:");
		int d=r.nextInt();
			System.out.println("enter the second array : ");
			for(int j=0;j<d;j++) {
			b[j]=r.nextInt();}
			swap(a,b,c,d);

	}
	public static boolean swap(int[] it1,int[] it2,int c,int d) {
		int temp;
		if(c==d) {
		for(int i=0;i<c;i++) {
			temp=it1[i];
			it1[i]=it2[i];
			it2[i]=temp;
			System.out.println("the first array is "+it1[i]);
			System.out.println("the second array is "+it2[i]);
			}}
		if(c==d)
			return true;
		else
			return false;
		
		
	}
	

}
