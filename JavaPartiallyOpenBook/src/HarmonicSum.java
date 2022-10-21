
public class HarmonicSum {
	 public static void main (String[] args) {

		 final int MAX_DENOMINATOR = 50000;
		
		 double sumL2R = 0.0;
		 double sumR2L = 0.0;
		 double absDiff;


		 // for-loop for summing from left
		 for (float denominator =1; denominator <= MAX_DENOMINATOR;++denominator) {
		
			 sumL2R +=1/denominator;
		
		 }
		 System.out.println("The sum from left-to-right is: " + sumL2R); 
		
		 for (int denominator =50000; denominator >= 1;--denominator) {
				
			 sumR2L = 1/denominator+sumR2L;
			
			 }
		 System.out.println("The sum from right-to-left is: " + sumR2L); 
		
		 if (sumL2R > sumR2L) {
			 absDiff=sumL2R - sumR2L;
			 System.out.println("THE ABSOLUTE DIFFERENCE = "+absDiff);
			 
		 }
		 else  
			 absDiff=sumR2L-sumL2R; 
		 System.out.println("THE ABSOLUTE DIFFERENCE = "+absDiff);
		 } 

}
