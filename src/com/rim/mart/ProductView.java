package com.rim.mart;

public class ProductView {
	//제품 정보를 출력하는 메소드
	public void view(Product p) {
		System.out.println("제품명:"+p.brand);
		System.out.println("가격:"+p.price);
		System.out.println("수량:"+p.amount);
	}

}
