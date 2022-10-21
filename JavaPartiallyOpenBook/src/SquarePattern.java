import java.util.Scanner;

public class SquarePattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		Scanner r=new Scanner(System.in);
		System.out.println("ENTER THE SIZE = ");
		size=r.nextInt();
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.print("# ");
			}
			System.out.println("");
		}

	}

}
