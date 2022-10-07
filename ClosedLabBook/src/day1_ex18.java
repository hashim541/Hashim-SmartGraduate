import java.util.Scanner;
public class day1_ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner r=new Scanner(System.in);
	System.out.println("enter a number : ");
	int num=r.nextInt();
	int temp=0;
	while(num>0) {
		temp+=num%10;
		temp*=10;
		num/=10;
	}
	System.out.println("the numbers in words :");
	while(temp>0) {
		num=temp%10;
		switch(num) {
		case 0:
			System.out.print(" ");
		    break;

		case 1:
			System.out.print(" ONE ");
			break;
		case 2:
			System.out.print(" TWO ");
			break;
		case 3:
			System.out.print(" THREE ");
			break;	
		case 4:
			System.out.print(" FOUR ");
			break;	
		case 5:
			System.out.print(" FIVE ");
			break;	
		case 6:
			System.out.print(" SIX ");
			break;
		case 7:
			System.out.print(" SEVEN ");
			break;	
		case 8:
			System.out.print(" EIGHT ");
			break;
		case 9:
			System.out.print(" NINE ");
			break;	
		default:
			System.out.println("invalid");
		}
		temp/=10;
	}

	}

}
