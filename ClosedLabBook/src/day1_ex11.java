import java.util.Scanner;

public class day1_ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][]a=new int[100][100];
		Scanner r=new Scanner(System.in);
		System.out.println("enter numbers in 4 by 4 matrix:");
		for(int i=0;i<4;i++) {
			for(int j=0;j<=i;j++) {
				a[i][j]=r.nextInt();
			}
		}
		for(int i=0;i<4;i++) {
			for(int j=0;j<=i;j++) {
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
