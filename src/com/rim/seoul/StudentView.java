package com.rim.seoul;

public class StudentView {
	
	public void listView(Student[] s) {
		
		if(s == null || s.length==0 ) {
			System.out.println("등록된 학생정보가 없습니다.");
			System.out.println();
		} else {
			for (int i = 0; i < s.length; i++) {
				System.out.println("[" + s[i].name + "] " + s[i].num + " 국어:" + s[i].kor
						+ " 영어:" + s[i].eng + " 수학:" + s[i].math + " 총점:" + s[i].total + " 평균:"
						+ s[i].avg);
			}
		}
	}
	
	public void view(Student student) {
		System.out.println("[" + student.name + "] " + student.num + " 국어:" + student.kor
				+ " 영어:" + student.eng + " 수학:" + student.math + " 총점:" + student.total + " 평균:"
				+ student.avg);
	
		
	}

}
