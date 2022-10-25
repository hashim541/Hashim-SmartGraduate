package javapartialyopenbook2;
import java.util.Scanner;
public class linearsearch {

	public static void main(String[] args) {
		int[] a=new int[100];
		int n,num,c=0,pos;
		Scanner r=new Scanner(System.in);
		System.out.println("enter the size of array : ");
		n=r.nextInt();
		System.out.println("enter the numbers : ");
		for(int i=0;i<n;i++) {
			a[i]=r.nextInt();
		}
		System.out.println("enter the searching element : ");
		num=r.nextInt();
		for(int i=0;i<n;i++) {
			if(a[i]==num) {
				c=1;
				pos=i+1;
				System.out.println(num+" found at the location at "+pos);
				break;
				
			}if(c==0) {
				System.out.println("element not found");
				break;
			}
		}

	}

}
