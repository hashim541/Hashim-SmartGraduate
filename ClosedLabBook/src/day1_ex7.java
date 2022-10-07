
public class day1_ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[] {5,2,9,0,7};
		int temp=0;
		System.out.println("elements of array: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]>a[j] ){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println();
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
