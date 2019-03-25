package com.rim.method;

public class MethodMain3 {

	public static void main(String[] args) {
		MethodTest3 t = new MethodTest3();
		
		int num=3;
		t.test(num);
		
		System.out.println(num);
		
		Product product = new Product();
		product.price=700;
		t.test2(product);
		System.out.println(product.price);
		
		t.test3(product);
		System.out.println(product.price);
		

	}

}
