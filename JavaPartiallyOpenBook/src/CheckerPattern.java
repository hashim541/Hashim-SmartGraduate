import java.util.Scanner;

public class CheckerPattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		Scanner r=new Scanner(System.in);
		System.out.println("ENTER THE SIZE = ");
		size=r.nextInt();
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(i%2==0) {
					System.out.print("# ");
				}
				else {
					System.out.print(" #");
				}
			}
			System.out.println("");
		}

	}

}
