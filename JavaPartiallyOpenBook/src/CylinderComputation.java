import java.util.Scanner;

public class CylinderComputation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius,surfacearea,volume,basearea,height;
		final double pi=3.14;
		Scanner r =new Scanner(System.in);
		System.out.println("ENTER THE RADIUS OF CYLINDER = ");
		radius=r.nextDouble();
		System.out.println("ENTER THE HEIGHT OF CYLINDER = ");
		height=r.nextDouble();
		basearea = pi * radius * radius; 
		surfacearea = 2.0 * Math.PI * radius + 2.0 * basearea; 
		volume = basearea * height; 
		System.out.println("THE BASE AREA IS = "+basearea);
		System.out.println("THE SURFACE AREA IS = "+surfacearea);
		System.out.println("THE VOLUME IS = "+volume);

	}

}
