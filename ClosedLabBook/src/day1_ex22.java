class model{
	public int a=10;
	private int b=20;
	protected int c=30;
	int d=40;
	public void test0() {
		System.out.println("inside public method..");
	}
	private void test1() {
		System.out.println("inside private method...");
	}
	protected void test2(){
	System.out.println("inside protected method...");	
	}
	void test3() {
		System.out.println("inside default method...");
	}
}
public class day1_ex22 {

	public static void main(String[] args) {
		model m=new model();
		System.out.println(m.a);
	//	System.out.println(m.b);
		System.out.println(m.c);
		System.out.println(m.d);

	}

}
