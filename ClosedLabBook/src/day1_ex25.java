class base{
	String method() {
		return "WOW";
	}
}
class derived{
	public void used() {
		base z=new base();
		System.out.println("base says, "+z.method());
	}
}
public class day1_ex25 {
	public static void main(String[] args) {
		derived d=new derived();
		d.used();
	}

}
