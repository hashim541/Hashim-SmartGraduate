import java.util.Scanner;
public class Arraytostring {

	public static void main(String[] args) {
		String[] s=new String[100];
		int a;
		Scanner r=new Scanner(System.in);
		System.out.println("enter the size of array : ");
		a=r.nextInt();
		System.out.println("enter the string : ");
		for(int i=0;i<a;i++) {
			s[i]=r.next();
		}
		arraytostring(s,a);

	}
	public static void arraytostring(String[] s,int a) {
		System.out.print("[");
		a=a-1;
		for(int i=0;i<a;i++) {
			System.out.print(s[i]+", ");
		}
		System.out.print(s[a]+" ]");
	}

}
