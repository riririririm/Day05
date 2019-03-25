package com.rim.school;

import java.util.Scanner;

public class SchoolMain5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		Teacher yu = new Teacher();
		yu.stu = null;
		System.out.println("선생님 이름:");
		yu.name = sc.next();
		System.out.println("선생님 과목:");
		yu.subject = sc.next();
		
		while(true) {
			int select=0;
			System.out.println("1.학생정보입력 / 2.출력 / 3.프로그램 종료");
			select = sc.nextInt();
			
			if(select==1) {
				System.out.println("학생수 입력:");
				int num = sc.nextInt();
				yu.stu = new Student[num];
				
				for(int i=0;i<num;i++) {
					yu.stu[i] = new Student();
					System.out.println(i+1+"번째 학생 이름 입력:");
					yu.stu[i].name = sc.next();
					System.out.println(i+1+"번째 학생 번호 입력:");
					yu.stu[i].number = sc.nextInt();
					
					System.out.println(i+1+"번째 학생 국어:");
					yu.stu[i].kor = sc.nextInt();
					System.out.println(i+1+"번째 학생 영어:");
					yu.stu[i].eng = sc.nextInt();
					System.out.println(i+1+"번째 학생 수학:");
					yu.stu[i].math = sc.nextInt();
					
					yu.stu[i].sum = yu.stu[i].kor+yu.stu[i].eng+yu.stu[i].math;
					yu.stu[i].avg = yu.stu[i].sum/3.0;
				}
			}else if(select==2) {
				System.out.println("====="+yu.name+"선생님반 학생들 정보");
				if(yu.stu == null || yu.stu.length==0 ) {
					System.out.println("등록된 학생정보가 없습니다.");
					System.out.println();
				} else {
					for (int i = 0; i < yu.stu.length; i++) {
						System.out.println("[" + yu.stu[i].name + "] " + yu.stu[i].number + " 국어:" + yu.stu[i].kor
								+ " 영어:" + yu.stu[i].eng + " 수학:" + yu.stu[i].math + " 총점:" + yu.stu[i].sum + " 평균:"
								+ yu.stu[i].avg);
					}
					System.out.println();
				}
			}
			else if(select==3) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		
		

	}

}
