package javapartialyopenbook2;
import java.util.Scanner;
public class ArrayMethodReverse {

	public static void main(String[] args) {
		int[] a=new int[100];
		Scanner r=new Scanner(System.in);
		System.out.println("enter the size of array :");
		int b=r.nextInt();
		System.out.println("enter the array :");
		for(int i=0;i<b;i++) {
			a[i]=r.nextInt();
		}System.out.print("[");
		for(int i=0;i<b-1;i++) {
			System.out.print(a[i]+",");
		}System.out.print(a[b-1]+"]");
		System.out.println();
		reverse(a,b);
	}
public static void reverse(int[] a,int b){
	System.out.println("the reversee is  :");
	System.out.print("[");
	for (int i=b-1;i>0;i--) {
		System.out.print(a[i]+",");
	}System.out.print(a[b-b]+"]");
	}
}
