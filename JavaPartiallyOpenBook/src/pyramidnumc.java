import java.util.Scanner;
public class pyramidnumc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner r=new Scanner(System.in);
		System.out.println("enter the row = ");
		int row=r.nextInt();
		for(int i=row;i<=1;++i) {
			for(int j=i;j>=1;--j) {
			
				System.out.print(j+" ");
			}
			System.out.println("");
		}

	}

}
