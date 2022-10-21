import java.util.Scanner;
public class CheckHexStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner r=new Scanner(System.in);
		String str;
		System.out.println("enter a hexa-decimal string : ");
		str =r.next();
		char[] a=str.toCharArray();
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>='0'&&a[i]<='9'||a[i]>='A'&& a[i]<='F'||a[i]>='a'&& a[i]<='f') {
				System.out.println(str+" is a hexa-decimal string");
				break;
			}else {
				System.out.println(str+" is not a hexa-decimal string");
				break;
			}
		}

	}

}
