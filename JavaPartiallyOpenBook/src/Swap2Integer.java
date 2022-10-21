import java.util.Scanner;

public class Swap2Integer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		
		Scanner r= new Scanner(System.in);
		System.out.println("ENTER THE FIRST NUMBER = ");
		x=r.nextInt();
		System.out.println("ENTER THE SECOND NUMBER = ");
		y=r.nextInt();
		int temp=x;
		x=y;
		y=temp;
		System.out.println("THE FIRST SWAPED NUMBER IS = "+x);
		System.out.println("THE SECON SWAPED NUMBER IS = "+y);

	}

}
