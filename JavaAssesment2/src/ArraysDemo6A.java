
public class ArraysDemo6A {

	public static void main(String[] args) {
		
		ArraysDemo6A  a = new ArraysDemo6A();
		int b[] = a.fun();
		System.out.println(b[0]);
		System.out.println(a.fun()[5]);

	}
	
	int[] fun(){
		
		int k[] = {1,2,3,4,5,6};
		return k;
	}

}
