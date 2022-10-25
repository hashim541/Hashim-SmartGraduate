package javapartialyopenbook2;
import java.util.Scanner;
public class GradesHistogram {

	public static void main(String[] args) {
		int[] a=new int[10];
		Scanner r=new Scanner(System.in);
		int lb=0,ub=9;
		System.out.println("enter the no of students from 0~9  10~19  20-29  30-39  40-49  50-59  60-69  70-79  80-89  90-100 ");
		for(int i=0;i<a.length;i++) {
			a[i]=r.nextInt();
		}
		horizontal(a,lb,ub);
		vertical(a,lb,ub);

	}
	public static void horizontal(int[] a,int lb,int ub) {
		for(int i=0;i<a.length;i++) {
			System.out.print(lb+"-"+ub+" : ");
			for(int j=1;j<=a[i];j++) {
				System.out.print("* ");
			}System.out.println();
			lb+=10;
			ub+=10;
		}
	}
	public static void vertical(int[] a,int lb,int ub) {
		for(int i=10;i>=1;i--) {
			for(int j=0;j<a.length;j++) {
				if(i==a[j]) {
					System.out.print("  *  ");
					--a[j];
				}else {
					System.out.print("     ");
				}
				System.out.print(" ");
			}System.out.println();
		}System.out.println(" 0-09 10-19 20-29 30-39 40-49 50-59 60-69 70-79 80-89 90-100");
	}

}
