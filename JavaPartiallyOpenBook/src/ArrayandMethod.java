import java.util.Scanner;
public class ArrayandMethod {

	public static void main(String[] args) {
		float[] f =new float[100] ;
		double[] d=new double[100];
		Scanner r=new Scanner(System.in);
		System.out.println("enter the float array : ");
		for(int i=0;i<5;i++) {
		f[i]=r.nextFloat();}
		System.out.println("enter the double array : ");
		for(int j=0;j<5;j++) {
		d[j]=r.nextDouble();}
		print(f,d);

	}
	public static void print(float[] f,double[] d) {
		for(int i=0;i<5;i++) {
			System.out.println(f[i]);
		}
		for(int j=0;j<5;j++) {
			System.out.println(d[j]);
		}
	}
}
