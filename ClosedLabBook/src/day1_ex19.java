import java.util.Scanner;
public class day1_ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][]a=new int[100][100];
		Scanner r=new Scanner(System.in);
		int n=4;
		System.out.println("enter numbers in 4 by 4 matrix:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=r.nextInt();
			}
		}
		for(int i=0;i<4;i++) {
			for(int j=3;j>=0;j--) {
				
				if(a[i][j]<10) {
					System.out.print("  "+a[i][j]+" ");
				}else {
					System.out.print("  "+a[i][j]);
				}
			}
			System.out.println();
		}

	}

}
