import java.util.Scanner;
public class day1_ex27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner r=new Scanner(System.in);
		System.out.println("enter the invested amount : ");
		double inv=r.nextDouble();
		double value=inv;
		value +=inv*0.4;
		System.out.println("first year value after increased by 40% : $"+value);
		value-=1500;
		System.out.println("second year value after lost $1500 : $"+value);
		value+=value*0.2;
		System.out.println("third year after increment of 20% : $"+value);

	}

}
