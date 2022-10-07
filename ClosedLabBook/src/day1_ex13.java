import java.util.Scanner;
public class day1_ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,mark;
		Scanner r=new Scanner(System.in);
		System.out.println("enter the total no of students : ");
		n=r.nextInt();
		System.out.println("enter the marks for students\n");
		System.out.println("STUDENT     MARKS\n");
		for(int i=1;i<=n;i++) {
			System.out.print("student "+i+"   ");
			
				mark=r.nextInt();
			
			System.out.println();
		}

	}

}
