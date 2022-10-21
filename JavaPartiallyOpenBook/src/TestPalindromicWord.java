import java.util.Scanner;
public class TestPalindromicWord {

	public static void main(String[] args) {
		String str,rts="";
		Scanner r=new Scanner(System.in);
		System.out.println("enter a string : ");
		str =r.next();
		int strl=str.length();
		for(int i=strl-1; i>=0;--i) {
			rts=rts+str.charAt(i);
		}
		System.out.println("the reversed string :"+rts);
		if(str.equals(rts)) {
			System.out.println("it is a palindrome");
		}else {
			System.out.println("it is not a palindrome");
		}

	}

}
