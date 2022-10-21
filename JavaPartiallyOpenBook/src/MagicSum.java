import java.util.Scanner;
public class MagicSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sentinel=-1;
		
		int number;
		int sum=0;
		Scanner r=new Scanner(System.in);
		do {
		System.out.println("enter a positive number (or -1 to end ): ");
		number=r.nextInt();
		sum=sum+number;
		}while(number !=sentinel);
		System.out.println("the magic sum is :"+sum);

}
}
