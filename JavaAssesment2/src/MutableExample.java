
public class MutableExample {
	
	int a = 5;

	public static void main(String[] args) {
		
		MutableExample m = new MutableExample();
		m.funA();
		System.out.println(m.a);
	}
	
	void funA(){
		
		a = 10;
	}
	
	// When the object Status is Changed it is known as Mutable.
	// Object status changing means inside the data Changes.

}
