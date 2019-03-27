package com.rim.seoul;

import java.util.Scanner;

public class StudentInput {
	
	public Student[] setStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생수 입력:");
		int stu_num = sc.nextInt();
		
		Student[] students = new Student[stu_num];

		for (int i = 0; i < students.length; i++) {
			Student student = new Student();

			System.out.println("이름입력:");
			student.name = sc.next();
			System.out.println("번호입력:");
			student.num = sc.nextInt();
			System.out.println("kor:");
			student.kor = sc.nextInt();
			System.out.println("eng:");
			student.eng = sc.nextInt();
			System.out.println("math:");
			student.math = sc.nextInt();

			student.total = student.kor + student.eng + student.math;
			student.avg = student.total / 3.0;
			students[i] = student;
		}
		
		
		return students;
	}

}
