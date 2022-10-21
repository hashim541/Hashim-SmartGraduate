import java.util.Scanner;

public class CircleComputation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius,diameter,area,circumference;
		final double pi=3.14;
		Scanner r =new Scanner(System.in);
		System.out.println("ENTER THE RADIUS OF CIRCLE = ");
		radius=r.nextDouble();
		diameter=2*radius;
		System.out.println("THE DIAMETER IS = "+diameter);
		area=pi*radius*radius;
		System.out.println("THE AREA IS = "+area);
		circumference=pi*2*radius;
		System.out.println("THE CIRCUMFERENCE IS = "+circumference);

	}

}
