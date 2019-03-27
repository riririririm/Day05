package com.rim.seoul;

import java.util.Scanner;

public class StudentSearch {
	Scanner sc = new Scanner(System.in);
	StudentView sv = new StudentView();
	
	public Student search(Student[] students) {
		//학생번호 입력받기
		//배열에서 학생버노랑 일치하는것 찾아서 리턴
		Student stu = null;
		System.out.println("검색할 학생 번호:");
		int num = sc.nextInt();

		for (int i = 0; i < students.length; i++) {
			if (num == students[i].num) {
				stu = students[i];
				
			}	
		}
		
		return stu;
				
	}
}
