import java.util.Scanner;

public class SumOfReversedDigitsInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,reverse=0,indigit,sum=0;
		Scanner r=new Scanner(System.in);
		System.out.println("ENTER THE INTEGER = ");
		number=r.nextInt();
		while(number!=0) {
			indigit=number%10;
			reverse=reverse*10+indigit;
			number=number/10;
			sum=sum+indigit;
			
		}
		System.out.println("THE REVERSED NUMBER IS = "+reverse);
		System.out.println("THE SUM OF REVERSED NUMBER IS = "+sum);


	}

}
