
public class ComputePI {
	public static void main(String[] agrs) {
		double sum1 = 0.0;
		double sum2=0.0;
		 int MAX_DENOMINATOR = 10000; 
		 for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator ++) {
				 
				  if (denominator % 4 == 1) {
				  sum1 +=1/denominator;
				  } else if (denominator % 4 == 3) {
				  sum2 -=1/denominator;
				  } else { 
				  System.out.println("Impossible!!!");
				  }
				  } 
		 System.out.printl("THE PI VALUE IS ="+(sum1+sum2));

	}

}
