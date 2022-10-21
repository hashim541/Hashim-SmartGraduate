import java.util.Scanner;
public class Exponent {

	public static void main(String[] args) {
		int exp;
		int base;
		Scanner r=new Scanner(System.in);
		System.out.println("enter the base : ");
		base=r.nextInt();
		System.out.println("enter the exponential : ");
		exp=r.nextInt();
		System.out.println(base+" raises to the power of "+exp+" is "+exponent(base,exp));
	}
	
	public static int exponent(int b, int e) {
		int product=1;
		for(int i=1;i<=e;i++) {
			product*=b;
		}
		return product;
	}	
	}
	
	
