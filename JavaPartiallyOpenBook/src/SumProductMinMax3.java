import java.util.Scanner;

public class SumProductMinMax3 {
public static void main(String[] args) {
		
		int n1,n2,n3;
		Scanner in = new Scanner(System.in); 
		System.out.print("Enter first integer: ");
		n1=in.nextInt();

		System.out.print("Enter second integer: ");
		n2=in.nextInt();
		System.out.print("Enter third integer: ");
		n3=in.nextInt();
		System.out.println(" the product is = "+(n1*n2*n3));
		
		if(n1>n2) {
			System.out.println(n1+" is the greatest");
		}
		else if(n2>n3) {
			System.out.println(n2+" is the greatest");
			
		}
		else {
			System.out.println(n3+" is the greatest");
		}
		if(n1<n2) {
			System.out.println(n1+" is the least");
		}
		else if(n2<n3) {
			System.out.println(n2+" is the least");
			
		}
		else {
			System.out.println(n3+" is the least");
		}
	}

}
