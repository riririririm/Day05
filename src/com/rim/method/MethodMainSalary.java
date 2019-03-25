package com.rim.method;

import java.util.Scanner;

public class MethodMainSalary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MethodTest2 t = null;
		boolean check = true; int salary=0;

		while (check) {
			System.out.println();
			System.out.println("1.급여입력 / 2.고용보험 / 3.의료보험 / 4.국민연금 / 5.산재보험");
			int select = sc.nextInt();
			t = new MethodTest2();

			switch (select) {
			case 1:
				System.out.println("급여를 입력하세요:");
				salary = sc.nextInt();
				break;
			case 2:
				t.m1(salary);
				break;
			case 3:
				t.m2(salary);
				break;
			case 4:
				t.m3(salary);
				break;
			case 5:
				t.m4(salary);
				break;

			default:
				System.out.println("1~5번 사이를 선택하세요.");
				break;
			}
		}

	}

}
