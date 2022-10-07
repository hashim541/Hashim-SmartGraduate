
public class day1_ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[] {1,2,3,4,5,6,7,8,9};
		System.out.println("the element before reverse");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\nelement after reverse");
		for(int j=a.length-1;j>=0;--j) {
			System.out.print(a[j]+" ");
		}

	}

}
