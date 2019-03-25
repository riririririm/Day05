package com.rim.school;

import java.util.Scanner;

public class SchoolMaine_t {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		Teacher yu = new Teacher();
		StudentView sv = new StudentView();
		yu.stu = null;
		System.out.println("선생님 이름:");
		yu.name = sc.next();
		System.out.println("선생님 과목:");
		yu.subject = sc.next();
		
		boolean check =true;
		
		while(check) {
			int select=0;
			System.out.println();
			System.out.println("1.학생정보입력 / 2.출력 / 3.학생 검색 / 4.프로그램 종료");
			select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("학생수 입력:");
				int num = sc.nextInt();
				yu.stu = new Student[num];
				
				for(int i=0;i<num;i++) {
					Student student = new Student();
					
					System.out.println(i+1+"번째 학생 이름 입력:");
					student.name = sc.next();
					System.out.println(i+1+"번째 학생 번호 입력:");
					student.number = sc.nextInt();
			
					System.out.println(i+1+"번째 학생 국어:");
					student.kor = sc.nextInt();
					System.out.println(i+1+"번째 학생 영어:");
					student.eng = sc.nextInt();
					System.out.println(i+1+"번째 학생 수학:");
					student.math = sc.nextInt();
					
					student.sum = student.kor + student.eng + student.math;
					student.avg = student.sum/3.0;
					
					yu.stu[i] = student;
				}
				
				break;
			case 2:
				System.out.println("====="+yu.name+"선생님반 학생들 정보");
				sv.listView(yu.stu);
				break;
			case 3:
				System.out.println("검색하실 학생 번호:");
				int number = sc.nextInt(); 
				boolean find = false;
				
				if(yu.stu == null || yu.stu.length==0 ) {
					System.out.println("등록된 학생정보가 없습니다.");
					System.out.println();
				} 
				else {
					for (int i = 0; i < yu.stu.length; i++) {
						if (yu.stu[i].number == number) {
							sv.view(yu.stu[i]);
							find=!find;
						}
					}
					if(find!=true)
						System.out.println("해당 번호의 학생이 존재하지 않음");
				}
				break;
				
			case 4:
				System.out.println("프로그램 종료");
				check=!check;
				break;
			}
				
		}
		
		


	}

}
