package javapartialyopenbook2;
import java.util.Scanner;
import java.util.Arrays;
public class MethodGradeStastistics {

	public static void main(String[] args) {
		int[] a=new int[100];
		Scanner r=new Scanner(System.in);
		System.out.print("Enter the number of students :");
		int b=r.nextInt();
		for (int i=1;i<b+1;i++) {
			System.out.print("enter the grade for student "+i+":");
			a[i]=r.nextInt();
		}
		grade(a,b);
		System.out.print("the average is : "+average(a,b));
		System.out.print("the median is: "+median(a,b));
		System.out.print("the maximum is : "+maximum(a,b));
		System.out.print("the minimum is : "+minimum(a,b));
		System.out.print("the standard deviation is : "+sd(a,b));

	}
	public static void grade(int[] a,int b) {
		System.out.print("the grades are : ");
		System.out.print("[");
		for(int i=1;i<b;i++) {
			System.out.print(a[i]+",");
		}System.out.print(a[b]+"]");
	}
	public static double average(int[] a,int b) {
		int num=0;
		System.out.println();
		for(int i=0;i<b+1;i++) {
			num+=a[i];
		}
	
		double c=num/(double)b;
		return c;
	}
	public static double median(int[] a,int b) {
		System.out.println();
		int sum=0;
		for(double num:a) {
			sum+=num;
		}
		return sum/b;
	}
	public static int maximum(int[] a,int b){
		System.out.println();
		int max = a[0];
		for(int i=1;i<a.length;i++) 
		if(a[i]>max) 
			max=a[i];
		return max;
	}
	public static int minimum(int[] a,int b){
		System.out.println();
		int min = a[1];
		for(int i=1;i<b;i++) 
		if(a[i]<min) 
			min=a[i];
		return min;
	}
	public static double sd(int[] a,int b) {
		System.out.println();
		double sum=0.0,std=0.0;
		int l=a.length;
		for(double num:a) {
			sum+=num;
		}
		double mean=sum/l;
		for(double num:a) {
			std+=Math.pow(num-mean, 2);
		}
		return Math.sqrt(std/l);
	}

}
