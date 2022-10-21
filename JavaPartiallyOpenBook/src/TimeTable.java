import java.util.Scanner;

public class TimeTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		Scanner r=new Scanner(System.in);
		System.out.println("ENTER THE SIZE = ");
		size=r.nextInt();
		for(int i=1;i<=size;i++) {
			System.out.print(" ");
			for(int j=1;j<=size;j++) {
				System.out.print(i*j+" ");
			}
			System.out.println(" ");
		}

	}

}
