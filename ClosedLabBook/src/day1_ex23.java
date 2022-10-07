
public class day1_ex23 {
	hashim ex=new hashim();
	void manipulate (int a) {
		System.out.println("the number is "+ex.num);
		System.out.println("manipulating a protected member from other class....");
		ex.num=a;
		System.out.println(ex.num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day1_ex23 ex1=new day1_ex23();
		ex1.manipulate(5);
		System.out.println("manupulated successfully...");

	}

}
class hashim{
	protected int num=10;
}