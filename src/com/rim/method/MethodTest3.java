package com.rim.method;

public class MethodTest3 {

	public void test(int num) {
		num+=3;
	}
	
	public void test2(Product p) {
		p.price +=300;
		                       
	}
	
	public void test3(Product p) {
		p= new Product();
		p.price=500;
	}
	
}
