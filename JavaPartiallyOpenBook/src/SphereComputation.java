import java.util.Scanner;

public class SphereComputation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double radius,surfacearea,volume;
		final double pi=3.14;
		Scanner r =new Scanner(System.in);
		System.out.println("ENTER THE RADIUS OF CIRCLE = ");
		radius=r.nextDouble();
		surfacearea=4 * pi * radius * radius; 
		System.out.println("THE SURFACE AREA IS = "+surfacearea);
		volume=4/3 *pi*radius*radius*radius;
		System.out.println("THE VOLUME IS = "+volume);

	}

}
