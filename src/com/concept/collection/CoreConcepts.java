package com.concept.collection;

public class CoreConcepts {

	public static void main( String args[]) {
		genericFunc("4","5");
		genericFunc(8,9);
		genericFunc(6.5,7.5);
		
	}
	
	public static <T> void genericFunc(T a , T b) {
		T temp = a;
		a = b;
		b = (T) temp;
		
		System.out.println("a="+ a + " b="+b);
	}
}
