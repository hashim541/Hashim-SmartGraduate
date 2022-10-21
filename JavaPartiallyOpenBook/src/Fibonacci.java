
public class Fibonacci {
	public static void main (String[] args) {
		 int n = 1; 
		 int fn; 
		 int fnMinus1 = 1; 
		 int fnMinus2 = 1;
		 int sum=2;
		 int nMax = 20; 
		 double average; 
		 
		 System.out.println("The first " + nMax + " Fibonacci numbers are:"); 
		 
		 
		 while (n <= nMax) { 
			 System.out.print(fnMinus2+" ");
		 ++n; 
		 fn = fnMinus2+fnMinus1;
		 fnMinus2 = fnMinus1; 
		 fnMinus1 = fn; 
		 } 
		 
		 average =fnMinus1/nMax;
		 System.out.println("\n THE AVERAGE IS = "+average);
		
		 } 

}
