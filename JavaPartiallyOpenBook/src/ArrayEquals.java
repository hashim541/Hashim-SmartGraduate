import java.util.Scanner;
public class ArrayEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a =new int[100];
		Scanner r=new Scanner(System.in);
		System.out.println("enter the size of array : ");
		int c=r.nextInt();
		System.out.println("enter the first array : ");
		for(int i=0;i<c;i++) {
			a[i]=r.nextInt();
		}
		int[] b =new int[100];
		
		System.out.println("enter the second array : ");
		for(int i=0;i<c;i++) {
			b[i]=r.nextInt();
		}
		equals(a,b);
	
	}
	public static void equals(int[] a,int[] b) {
		boolean flag;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=b[i]) {
				flag=false;
				System.out.println(flag);
				break;
			}else {
				flag=true;
				System.out.println(flag);
				break;
			}
		}
		
	}

}
