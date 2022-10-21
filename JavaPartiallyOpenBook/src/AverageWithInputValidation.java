import java.util.Scanner;

public class AverageWithInputValidation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nostudents=3,marks,student,sum=0,average;
		boolean valid;
		Scanner r=new Scanner(System.in);
		for(int i=1;i<=nostudents;i++) {
			
			
			valid=false;
			System.out.println("ENTER THE MARKS FOR STUDENT"+i+" ");
			marks=r.nextInt();
			do {
				if(marks>0&&marks<=100) { 
					System.out.println("ENTER THE MARKS FOR STUDENT"+i+" ");
					marks=r.nextInt();
				}
				else {
					System.out.println("INVALID NUMBER..... TRY AGAIN !");
				}
				
				
				
			}while(marks<0&&marks>=100);
		}

	}

}
