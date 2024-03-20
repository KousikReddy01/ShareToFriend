package com.Generics;

public class GenericsDemo2<T> {

	public static void main(String[] args) {


		GenericsDemo2<String> g1 = new GenericsDemo2<String>();
		g1.funA("Generics Demo");
		
		GenericsDemo2<Integer> g2 = new GenericsDemo2<Integer>();
		g2.funA(10);
		
		GenericsDemo2<Boolean> g3 = new GenericsDemo2<Boolean>();
		g3.funA(true);
		
	}
	
	
	void funA(T t1){
		System.out.println(t1);
	}

}
