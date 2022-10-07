
public class day1_ex3 {

	public static void main(String[] args) {
		System.out.println("IMPLICIT TYPE CASTING");
		byte b=12;
		System.out.println("byte value : "+b);
		short s=b;
		System.out.println("short value : "+s);
		int i=s;
		System.out.println("int value : "+i);
		long l=i;
		System.out.println("long value : "+l);
		float f=l;
		System.out.println("float value : "+f);
		double d=f;
		System.out.println("double value : "+d);
		System.out.println("\nEXPLICIT TYPE CASTING");
		byte b1=10;
		System.out.println("byte value : "+b1);
		short s1=(short)b1;
		System.out.println("short value : "+s1);
		int i1=(int)s1;
		System.out.println("int value : "+i1);
		long l1=(long)i1;
		System.out.println("long value : "+l1);
		float f1=(float)l1;
		System.out.println("float value : "+f1);
		double d1=(double)f1;
		System.out.println("double value : "+d1);

	}

}
