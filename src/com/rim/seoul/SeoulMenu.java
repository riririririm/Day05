package com.rim.seoul;

import java.util.Scanner;

public class SeoulMenu {
	public void start() {
		Scanner sc = new Scanner(System.in);
		Student[] students = null;
		StudentView sv = new StudentView();
		StudentSearch ss = new StudentSearch();
		StudentInput si = new StudentInput();

		while (true) {
			System.out.println("1.정보입력 / 2.전체정보 / 3.개인검색 / 4.종료");
			int select = sc.nextInt();

			if (select == 1) {
				//1.정보입력
				students =si.setStudent();
			} else if (select == 2) {
				// 2.전체 정보 출력
				sv.listView(students);
			} else if (select == 3) {
				// 3.개인정보 검색
				
				if (students == null) {// 등록된 학생이 아예 없는 경우
					System.out.println("등록된 정보가 없습니다.");
				} else { //등록된 학생이 있는 경우
					Student find = ss.search(students); //찾는 학생이 있는지 확인

					if (find == null) //찾는 학생이 없는 경우
						System.out.println("해당 번호로 등록된 학생이 없습니다.");
					else //찾는 학생이 있는 경우
						sv.view(find); //그 학생 정보 출력
				}
			} else if (select == 4) {
				// 4.프로그램 종료
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("1~4번 사이중에 선택하세요");
			}
			// end of else if
		} // end of while
	}

}
