import java.util.Scanner;
public class day1_ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][]a=new int[100][100];
		Scanner r=new Scanner(System.in);
		int ro,c;
		int max=Integer.MIN_VALUE;
		System.out.println("enter numbers of rows :");
		ro=r.nextInt();
		System.out.println("enter the columns : ");
		c=r.nextInt();
		for(int i=0;i<ro;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=r.nextInt();
			}
		}
		for(int i=0;i<ro;i++) {
			max=Integer.MIN_VALUE;
			for(int j=0;j<c;j++) {
				max=Math.max(max,a[i][j]);
				
			}
			System.out.print("maximum of  "+(i+1)+" row is "+max+" \n");
		}

	}

}
