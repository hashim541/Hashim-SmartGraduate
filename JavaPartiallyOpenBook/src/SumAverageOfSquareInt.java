import java.util.Scanner;

public class SumAverageOfSquareInt {
	public static void main (String[] args) {
	Scanner r= new Scanner(System.in);
		 int sum = 0;
		 double average;
		 final int LOWERBOUND;
		 final int UPPERBOUND;
		 System.out.println("ENTER THE LOWERBOUND AND UPPERBOUND 1~100");
		 System.out.println("ENTER THE LOWER BOUND =");
		 LOWERBOUND =r.nextInt();
		 
		 System.out.println("ENTER THE UPPERBOUND =");
		 UPPERBOUND =r.nextInt();
		 for (int number = LOWERBOUND; number <= UPPERBOUND; ++number)
		{
		
		 sum += number*number;
		 }
		 System.out.println("THE SUM OF SQUARED NUMBER IS ="+sum);
		average=sum/UPPERBOUND;
		System.out.println("THE AVERAGE IS ="+average);
		 } 

}
