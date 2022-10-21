import java.util.Scanner;
public class ExchangeCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner r=new Scanner(System.in);
		System.out.println("enter a string : ");
		String str=r.next();
		System.out.print("the cipher text : ");
		int b=25;
		char[] a=str.toCharArray();
		for(int i=0 ; i<str.length();i++) {
			
			int num=a[i];
			int z=num+b;
			char ch=(char)z;
			b=b-2;
			System.out.print(ch);
			}

	}

}
