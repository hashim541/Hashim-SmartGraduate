import java.util.Scanner;
public class OddEvenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
	
		Scanner r=new Scanner(System.in);
		System.out.println("enter the number : ");
		num=r.nextInt();
		isOdd(num);

	}
	public static int isOdd(int number) {
		if(number%2==0) {
			System.out.println(number+" is even number ");
		}else {
			System.out.println(number+" is odd number ");
		}
		return 0;
	}
	
}
