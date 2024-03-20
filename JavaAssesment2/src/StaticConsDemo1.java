
public class StaticConsDemo1 {
	
	int i = 1;
	static int j = 1;
	
	StaticConsDemo1(){
		
		i++;
		j++;
		
	}

	public static void main(String[] args) {
		
		System.out.println(j);
		
		StaticConsDemo1 s = new StaticConsDemo1();
		System.out.println(s.i);
	//	System.out.println(s.j);
		
		StaticConsDemo1 s1 = new StaticConsDemo1();
		System.out.println(s1.i);
	//	System.out.println(s1.j);

	}

}
