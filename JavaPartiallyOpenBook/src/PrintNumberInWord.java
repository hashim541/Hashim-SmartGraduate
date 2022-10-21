import java.util.Scanner;

public class PrintNumberInWord {
	public static void main(String[] args) {
		Scanner r=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER FROM 0~10: ");
		 int number = r.nextInt();
		 switch(number) {
		 case 1:
			 System.out.println("ONE ");
			 break;
		 case 2:
			 System.out.println("TWO ");
			 break;
		 case 3:
			 System.out.println("THREE");
			 break;
		 case 4:
			 System.out.println("FOUR");
			 break;
		 case 5:
			 System.out.println("FIVE ");
			 break;
		 case 6:
			 System.out.println("SIX ");
			 break;
		 case 7:
			 System.out.println("SEVEN ");
			 break;
		 case 8:
			 System.out.println("EIGHT ");
			 break;
		 case 9:
			 System.out.println("NINE ");
			 break;
		 default:
			 System.out.println("OTHER ");
		 }
	}

}
