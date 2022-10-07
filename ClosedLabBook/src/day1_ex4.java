import java.util.Scanner;
public class day1_ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=0,flag=0;
		Scanner r=new Scanner(System.in);
		System.out.println("enter a number : ");
		int n=r.nextInt();
		m=n/2;
		if(n==0||n==1) {
			System.out.println(n+" is not a prime number");
		}else {
			for(int i=2;i<=m;i++) {
				if(n%i==0) {
					System.out.println(n+" is not a prime number");
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println(n+" is prime number ");
			}
		}

	}

}
