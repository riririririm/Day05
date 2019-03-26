package com.rim.seoul;

import java.util.Scanner;

public class SeoulMenu {
	public void start() {
		Scanner sc = new Scanner(System.in);
		Student[] students = null;

		while (true) {
			System.out.println("1.정보입력 / 2.전체정보 / 3.개인정보 / 4.종료");
			int select = sc.nextInt();

			if (select == 1) {
				System.out.println("학생수 입력:");
				int stu_num = sc.nextInt();
				students = new Student[stu_num];

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
			} else if (select == 2) {
				if (students == null) {
					System.out.println("등록된 정보가 없습니다.");
				} else {
					for (int i = 0; i < students.length; i++) {
						System.out.println("[이름]: " + students[i].name);
						System.out.println("번호: " + students[i].num);
						System.out.println("국어: " + students[i].kor);
						System.out.println("영어: " + students[i].eng);
						System.out.println("수학: " + students[i].math);
						System.out.println("총점: " + students[i].total);
						System.out.println("평균: " + students[i].avg);
					}
				}
			} else if (select == 3) {
				if (students == null) {
					System.out.println("등록된 정보가 없습니다.");
				} else {
					System.out.println("검색할 학생 번호:");
					int num = sc.nextInt();
					boolean find = false;

					for (int i = 0; i < students.length; i++) {
						if (num == students[i].num) {
							System.out.println("[이름]: " + students[i].name);
							System.out.println("번호: " + students[i].num);
							System.out.println("국어: " + students[i].kor);
							System.out.println("영어: " + students[i].eng);
							System.out.println("수학: " + students[i].math);
							System.out.println("총점: " + students[i].total);
							System.out.println("평균: " + students[i].avg);
							find = !find;
						}
					}
					if (find == false) {
						System.out.println("해당 번호로 등록된 학생이 없습니다.");
					}
				}
			}else if(select==4) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("1~4번 사이중에 선택하세요");
			}
			// end of else if
		} // end of while
	}

}
