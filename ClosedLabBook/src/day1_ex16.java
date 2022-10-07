import java.util.Scanner;
public class day1_ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,s,c=0,pos;
		int[] a=new int[50];
		Scanner r=new Scanner(System.in);
		System.out.println("enter the total number of elements : ");
		n=r.nextInt();
		System.out.println("enter "+n+" numbers :");
		for(int i=0;i<n;i++) {
			a[i]=r.nextInt();
		}
		System.out.println("enter the searching element :" );
		s=r.nextInt();
		for(int i=0;i<n;i++) {
			if(a[i]==s) {
				c=1;
				pos=i+1;
				System.out.println(s+" found at position "+pos);
				
			}
		}
		if(c==0) {
			System.out.println("not found");
		}

	}

}
