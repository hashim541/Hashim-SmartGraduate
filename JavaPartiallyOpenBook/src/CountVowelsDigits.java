import java.util.Scanner;
public class CountVowelsDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner r=new Scanner(System.in);
		System.out.println("enter a string : ");
		String str=r.next();
		int num=0;
		int vow=0;
		char[] a=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			 if(a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u'||a[i] == 'A' || a[i] == 'E' || a[i] == 'I' || a[i] == 'O' || a[i] == 'U' ) { 	
				 vow=vow+1;
			 }
			 else if(a[i] == '1' || a[i] == '2' || a[i] == '3' || a[i] == '4' || a[i] == '5'||a[i] == '6' || a[i] == '7' || a[i] == '8' || a[i] == '9' || a[i] == '0') {
				num=num+1; 
				 
			 }
		}
		System.out.println("number of vowles : "+vow);
		System.out.println("number of digits : "+num);
		

	}

}
