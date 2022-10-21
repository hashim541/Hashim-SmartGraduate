import java.util.Scanner;
public class TriangularPatternX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner r=new Scanner(System.in);
		System.out.println("enter the row = ");
		int row=r.nextInt();
		for(int i=1;i<=row;++i) {
			for(int j=1;j<=i;++j) {
				System.out.print("# ");
			}
			System.out.println("");
		}

	}

}
