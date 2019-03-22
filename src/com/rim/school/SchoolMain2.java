package com.rim.school;

import java.util.Scanner;

public class SchoolMain2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생수 입력:");
		int count = sc.nextInt();
		
		Student[] st = new Student[count];
		//Student st = null;
		//Student[] stu = new Student[count];
		
		for(int i=0;i<st.length;i++) {
			st[i]= new Student();
			System.out.println(i+1+"번째 학생 이름 입력:");
			st[i].name = sc.next();
			System.out.println(i+1+"번째 학생 번호 입력:");
			st[i].number = sc.nextInt();
			
			/*
			st= new Student();
			System.out.println(i+1+"번째 학생 이름 입력:");
			st.name = sc.next();
			System.out.println(i+1+"번째 학생 번호 입력:");
			st.number = sc.nextInt();
			stu[i]=st; 
			 */
		}
		
		for(int i=0;i<st.length;i++) {
			System.out.println("이름: "+st[i].name+" 번호: "+st[i].number);
		}
	
	}

}
