import java.util.Scanner;

public class IncomeTaxCalculatorWithSentinel {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float salary,tax;
		int sentine=-1;
		Scanner r= new Scanner(System.in);
		
		do {
			System.out.println("ENTER THE TAXABLE INCOME (TO END LOOP ENTER -1) = $");
			salary=r.nextFloat();
			
			if(salary<= 20000) {
				tax=salary;
				System.out.println("THE TAX YOU HAVE TO PAY IS = $"+tax);
			}else if(salary<= 40000) {
				tax=salary*10/100;
				System.out.println("THE TAX YOU HAVE TO PAY IS = $"+tax);
			}else if(salary <=60000) {
				tax=salary*20/100;
				System.out.println("THE TAX YOU HAVE TO PAY IS = $"+tax);
			}else {
				tax=salary*30/100;
				System.out.println("THE TAX YOU HAVE TO PAY IS = $"+tax);
			}
		
		}while(salary!=sentine);

		}

}
