import java.util.Scanner;
public class ReverseANumber {

	public static void main(String[] args) {
		int num=0;
		int reversenum=0;
		Scanner r=new Scanner(System.in);
		System.out.println("emter the number : ");
		num=r.nextInt();
		while(num!=0) {
			reversenum=reversenum *10;
			reversenum=reversenum+num%10;
			num/=10;
		}
		System.out.println("the reversed number is : "+reversenum);

	}

}
