import java.util.Scanner;
public class Oct2Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner r= new Scanner(System.in);
		String str;
		System.out.println("entre a binary string : ");
		str =r.next();
		int dec=Integer.parseInt(str,8);
		System.out.println(dec);

	}

}
