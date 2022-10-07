
public class PyramidExampleReverse {

	public static void main(String[] args) {
		int t=6;
		for(int i=1;i<=t;i++) {
			for(int j=t;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
