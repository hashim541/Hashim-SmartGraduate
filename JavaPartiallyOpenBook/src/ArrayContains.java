import java.util.Scanner;
public class ArrayContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a =new int[100];
		Scanner r=new Scanner(System.in);
		System.out.println("enter the size of array : ");
		int b=r.nextInt();
		System.out.println("enter a element to search : ");
		int c=r.nextInt();
		System.out.println("enter the array : ");
		for(int i=0;i<b;i++) {
			a[i]=r.nextInt();
		}
		contains(a,b,c);

	}
public static void contains(int[] a,int b,int c ) {
	System.out.print("[");
	b=b-1;
	int f=0;
	for(int i=0;i<b;i++) {
		System.out.print(a[i]+", ");
	}
	System.out.print(a[b]+"]");
	for(int i=0;i<b;i++) {
		if(a[i]==c) {
			f=1;
			break;
		}else {
			f=0;
			
		}
	}
	if(f==1) {
		System.out.println("the element "+c+" exists in the array");
	}else {
		System.out.println("the element does not exists");
	}

}
}
