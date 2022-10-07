import java.util.Scanner;
public class FindAreaOfTriangle {

	public static void main(String[] args) {
		Scanner r=new Scanner(System.in);
		System.out.println("enter the width of triangle : ");
		double width=r.nextDouble();
		System.out.println("Enter the height of the Triangle:"); 
		double height=r.nextDouble();
		double area = (width* height)/2;
		 System.out.println("Area of Triangle is: " + area);

	}

}
