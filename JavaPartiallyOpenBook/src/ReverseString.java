import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str,rts="";
		char ch;
		Scanner in= new Scanner(System.in);
		str=in.next();
		for(int num2 =0; num2<str.length() ; num2++ ) {
			ch=str.charAt(num2);
			rts=ch+rts;
			
		}
		System.out.println("the reversed string is : "+rts);

	}

}
