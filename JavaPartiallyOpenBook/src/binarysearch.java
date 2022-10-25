package javapartialyopenbook2;
import java.util.Scanner;
public class binarysearch {

	public static void main(String[] args) {
		int[] a=new int[100];
		int n,search,mid,fir,las;
		Scanner r=new Scanner(System.in);
		System.out.println("enter the size of array : ");
		n=r.nextInt();
		System.out.println("enter the numbers : ");
		for(int i=0;i<n;i++) {
			a[i]=r.nextInt();
		}
		System.out.println("enter the searching element : ");
		search=r.nextInt();
		fir=0;
		las=n-1;
		mid=(fir+las)/2;
		while(fir<=las) {
			if(a[mid]<search) {
				fir=mid+1;
			}else if(a[mid]==search){
				System.out.println(search+" found at location "+(mid+1));
				break;
			}else {
				las=mid+1;
			}
			mid=(fir+las)/2;
		}
		if(fir>las) {
			System.out.println(search+" not found");
		}
		

	}

}
