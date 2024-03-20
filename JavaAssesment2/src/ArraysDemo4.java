
public class ArraysDemo4 {

	public static void main(String[] args) {
		
		A k = new A();
		A a[] = new A[5];
		a[0] = new A();
		a[1] = new A();
		a[2] = k;
		a[3] = null;
		a[4] = new A();
		
		k.i = 9;
		
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(k);
		System.out.println(a[2].i);
		a[2].funA();
		

	}

}
