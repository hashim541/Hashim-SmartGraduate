import java.util.Scanner;
public class day1_ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,s,fir,las,mid;
		int[] a=new int[50];
		Scanner r=new Scanner(System.in);
		System.out.println("enter the total number of elements : ");
		n=r.nextInt();
		System.out.println("enter "+n+" numbers :");
		for(int i=0;i<n;i++) {
			a[i]=r.nextInt();
		}
		System.out.println("enter the searching element :" );
		s=r.nextInt();
		fir=0;
		las=n-1;
		mid=(fir+las)/2;
		while(fir<=las) {
			if(a[mid]<s) {
				fir=mid+1;
			}else if(a[mid]==s) {
				System.out.println(s+" found at location "+(mid+1)+"\n");
				break;
			}else {
				las=mid-1;
			}
			
			mid=(fir+las)/2;
			
		}
		if(fir>las) {
			System.out.println("the element is not present in the list...");
		}

	}

}
