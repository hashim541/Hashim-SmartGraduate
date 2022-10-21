import java.util.Scanner;
public class CheckBinStr {

	public static void main(String[] args) {
		Scanner r=new Scanner(System.in);
		System.out.println("enter a string : ");
		String str=r.next();
		boolean t=true;
		
		char[] a=str.toCharArray();
		for(int i=0 ; i<str.length();i++) {
			if(a[i]==0||a[i]==1) {
			
				System.out.println(str+" is a binary string");
				break;
			}else {
				System.out.println(str+" is not a binary string");
				break;
			}			
			
			}
		

	}

}
