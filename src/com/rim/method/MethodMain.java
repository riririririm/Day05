package com.rim.method;

import java.util.Scanner;

public class MethodMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MethodTest1 m1 = new MethodTest1();
		
		System.out.println("1. +  2. -");
		int select =sc.nextInt();
		
		switch(select) {
		case 1:
			System.out.println();
			m1.hap();
			break;
		case 2:
			m1.minus();
			break;
		
		}
		
		m1.bark(100);
		 m1.bark(50);
		
		

	}

}
