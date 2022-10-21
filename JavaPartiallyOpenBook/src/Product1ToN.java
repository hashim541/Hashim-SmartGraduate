import java.util.Scanner;

public class Product1ToN {
	public static void main (String[] args) {
		Scanner r= new Scanner(System.in);
			 long product=1;
			 
			 final int LOWERBOUND;
			 final int UPPERBOUND;
			 System.out.println("ENTER THE LOWERBOUND AND UPPERBOUND 1~100");
			 System.out.println("ENTER THE LOWER BOUND = ");
			 LOWERBOUND =r.nextInt();
			 
			 System.out.println("ENTER THE UPPERBOUND = ");
			 UPPERBOUND =r.nextInt();
			 for (int number = LOWERBOUND; number <= UPPERBOUND; ++number)
			{
			
			 product=product*number;
			 }
			 System.out.println("THE SUM OF SQUARED NUMBER IS = "+product);
			
			 } 

}
