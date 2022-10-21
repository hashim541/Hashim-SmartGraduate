import java.util.Scanner;

public class SalesTaxCalculator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double goodsprice,totalprice,actualprice;
		int sentine=-1;
		int tax;
		Scanner r =new Scanner(System.in);
		do {
			System.out.println("\n ENTER THE TAX-INCLUSIVE PRICE (-1 TO END LOOP) = $");
			goodsprice=r.nextDouble();
			actualprice=goodsprice-((int)goodsprice*7/100);
			tax=(int)goodsprice*7/100;
			
			System.out.println("THE ACTUAL PRICE IS = $"+actualprice);
			System.out.println("THE TAX IS = $"+tax);
			
		}while(goodsprice!=sentine);

	}

}
