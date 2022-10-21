import java.util.Scanner;
public class DecipherCaesarCode {

	public static void main(String[] args) {
		Scanner r=new Scanner(System.in);
		System.out.println("enter a string : ");
		String str=r.next();
		System.out.print("the cipher text : ");
		char[] a=str.toCharArray();
		for(int i=0 ; i<str.length();i++) {
			int num=a[i];
			int z=num-3;
			char ch=(char)z;
			System.out.print(ch);
			}

	}

}
