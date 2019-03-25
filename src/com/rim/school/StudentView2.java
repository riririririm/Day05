package com.rim.school;

public class StudentView2 {
	
	public void listView(Teacher t) {
		System.out.println("====="+t.name+"선생님반 학생들 정보");
		if(t.stu == null || t.stu.length==0 ) {
			System.out.println("등록된 학생정보가 없습니다.");
			System.out.println();
		} else {
			for (int i = 0; i < t.stu.length; i++) {
				System.out.println("[" + t.stu[i].name + "] " + t.stu[i].number + " 국어:" + t.stu[i].kor
						+ " 영어:" + t.stu[i].eng + " 수학:" + t.stu[i].math + " 총점:" + t.stu[i].sum + " 평균:"
						+ t.stu[i].avg);
			}
		}
	}
	
	public void view(Teacher t, int num) {
		int search_result=0;
	
		if(t.stu == null || t.stu.length==0 ) {
			System.out.println("등록된 학생정보가 없습니다.");
			System.out.println();
		} 
		else {
			for (int i = 0; i < t.stu.length; i++) {
				if (t.stu[i].number == num) {
					System.out.println("[" + t.stu[i].name + "] " + t.stu[i].number + " 국어:" + t.stu[i].kor
							+ " 영어:" + t.stu[i].eng + " 수학:" + t.stu[i].math + " 총점:" + t.stu[i].sum + " 평균:"
							+ t.stu[i].avg);
					search_result+=1;
				}
			}
			if(search_result==0)
				System.out.println("해당 번호의 학생이 존재하지 않음");
		}
	}

}
