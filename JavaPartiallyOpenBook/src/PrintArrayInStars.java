import java.util.Scanner;
public class PrintArrayInStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[100];
		Scanner r=new Scanner(System.in);
		System.out.println("enter the number of items = ");
		int n=r.nextInt();
		System.out.println("The values of all items : ");
		for(int i=0;i<n;i++) {
			a[i]=r.nextInt();
			for(int j=0;j<a[i];j++) {
				System.out.println("*");
			}
		}

	}

}
