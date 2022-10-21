import java.util.Scanner;

public class PensionContributionCalculatorWithSentinel {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salary,employee,employer;
		int age;
		int sentine=-1;
		Scanner r =new Scanner(System.in);
		do {
			
			System.out.println("\n ENTER YOUR SALARY = $");
			salary=r.nextFloat();
			System.out.println("ENTER YOUR AGE = ");
			age =r.nextInt();
			if(age <= 55) {
				employee=salary*20/100;
				employer=salary*17/100;
				System.out.println("THE EMPLOYEE'S CONTRIBUTION IS = $"+employee);
				System.out.println("THE EMPLOYER'S CONTRIBUTION IS = "+employer);
				System.out.println("THE TOTAL CONTRIBUTION IS = $"+(employee+employer));
			}
			else if(age <= 60) {
				employee=salary*13/100;
				employer=salary*13/100;
				System.out.println("THE EMPLOYEE'S CONTRIBUTION IS = $"+employee);
				System.out.println("THE EMPLOYER'S CONTRIBUTION IS = "+employer);
				System.out.println("THE TOTAL CONTRIBUTION IS = $"+(employee+employer));
			}
			else if(age <= 65) {
				employee=salary*7.5/100;
				employer=salary*9/100;
				System.out.println("THE EMPLOYEE'S CONTRIBUTION IS = $"+employee);
				System.out.println("THE EMPLOYER'S CONTRIBUTION IS = "+employer);
				System.out.println("THE TOTAL CONTRIBUTION IS = $"+(employee+employer));
			}
			else {
				employee=salary*5/100;
				employer=salary*7.5/100;
				System.out.println("THE EMPLOYEE'S CONTRIBUTION IS = $"+employee);
				System.out.println("THE EMPLOYER'S CONTRIBUTION IS = "+employer);
				System.out.println("THE TOTAL CONTRIBUTION IS = $"+(employee+employer));
			}
		}while(salary!=sentine);

	}

}
