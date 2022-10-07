import java.util.Scanner;
public class day1_ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,z=0,n;
		Scanner r=new Scanner(System.in);
		System.out.println("enter the how many number : ");
		n=r.nextInt();
		System.out.println("enter the "+n+" numbers :");
		for(int i=0;i<n;i++) {
			a=r.nextInt();
			z+=a;
		}
		average(n,z);

	}
	public static void average(int n,int z) {
		
		int avg;
		avg=z/n;
		System.out.println("THE AVERAGE IS : "+avg);
	}

}
