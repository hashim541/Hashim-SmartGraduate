import java.util.Scanner;

public class PrintDayInWord {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner r=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER FROM 1~7: ");
		 int number = r.nextInt();
		 switch(number) {
		 case 1:
			 System.out.println("SUNDAY");
			 break;
		 case 2:
			 System.out.println("MONDAY");
			 break;
		 case 3:
			 System.out.println("TUESDAY");
			 break;
		 case 4:
			 System.out.println("WEDNESDAY");
			 break;
		 case 5:
			 System.out.println("THURSDAY");
			 break;
		 case 6:
			 System.out.println("FRIDAY");
			 break;
		 case 7:
			 System.out.println("SATURDAY");
			 break;
		 }

	}

}
