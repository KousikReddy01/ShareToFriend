package com.Generics;

public class GenericsDemo1<G>{
	
	
	G g;
	
	public static void main(String[] args) {
	
//		GenericsDemo1 g = new GenericsDemo1();
//		g.funA(10);
//		g.funA(true);
//		g.funA("Generics");
//		g.funA(new GenericsDemo1());
//		g.funA(null);

	}
	
	void funA(G g1){
		System.out.println(g1);
	}

}
