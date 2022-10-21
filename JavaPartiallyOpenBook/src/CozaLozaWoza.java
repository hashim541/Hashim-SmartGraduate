
public class CozaLozaWoza {
	public static void main(String[] args) {
		 
		 for (int number = 1; number <=110; ++number)
		{
			  if (number%5==0&&number%3==0) {
				 System.out.print(" CozaLoza ");
				 }
				
				 else if(number%7==0&&number%5==0) {
					 System.out.println(" LozaWoza ");
				 }
				 else if(number%3==0&&number%7==0) {
					 System.out.println(" CozaWoza ");
				 }
		
				 else if (number%3==0) {
				 System.out.print(" Coza ");
				 }
				
				 else 
					 if (number%5==0) {
				 System.out.print(" Loza ");
				 }
				
				 else if(number%7==0) {
					 System.out.println(" Woza ");
				 }
		
		 else {
			 System.out.print(" "+number+" ");
		 }
		 
		 }
		
		 }

}
