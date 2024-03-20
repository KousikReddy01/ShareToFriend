
public class ArraysDemo6 {

	public static void main(String[] args) {
		
		ArraysDemo6 a = new ArraysDemo6();
		
		a.funA();
		System.out.println(a.funA());
		
		int b[] = a.funA();
		System.out.println(b[2]); 
		System.out.println(a.funA()[3]);

	}
	
	int[] funA(){
		
		int k[] = {10,20,30,40,50,60};
		return k;
	}

}
