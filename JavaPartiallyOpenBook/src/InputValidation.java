import java.util.Scanner;

public class InputValidation {
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int number;
	
		Scanner r=new Scanner(System.in);
		do {
			System.out.println("ENTER THE NUMBER BETWEEN 0~10 AND 90~100 = ");
			number=r.nextInt();
			if(number>0&&number<=10) {
				System.out.println("YOU HAVE ENTERED VALID NUMBER = "+number);
			}else if(number>=90&&number<=100) {
				System.out.println("YOU HAVE ENTERED VALID NUMBER = "+number);
			}else {
				System.out.println("INVALID NUMBER..... TRY AGAIN !");
			}
			
			
		}while(number>10&&number<90);
		
		

	}

}
