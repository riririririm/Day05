package com.rim.school;

import java.util.Scanner;

public class SchoolMain4 {

	public static void main(String[] args) {
		//1.학생등록
			//학생수 입력
			//학생번호 입력(학생수만큼 반복)
			//학생이름 입력
			//학생 국어, 수학, 영어점수 입력
		//2.전체정보 조회
			//번호, 이름, 국어, 수학, 영어 점수 출력
		//3.학생정보 검색
			//검색할 학생의 번호를 입력
			//검색한 학생의 정보 출력
		//4.프로그램 종료
		Scanner sc = new  Scanner(System.in);
		int count=0;
		Student[] st =null; int [] temp=null;
		
		
		while(true) {
			System.out.println("1.학생등록 / 2.전체정보 / 3.학생검색 / 4.총점순 / 5.종료");
			int select = sc.nextInt();
			
			if(select==5) {
				System.out.println("프로그램 종료");
				break;
			}else if(select==1) {
				System.out.println("학생수:");
				count = sc.nextInt();
				st =new Student[count];
				
				for(int i=0;i<count;i++) {
					st[i]= new Student();
					System.out.println(i+1+"번째 학생 이름 입력:");
					st[i].name = sc.next();
					System.out.println(i+1+"번째 학생 번호 입력:");
					st[i].number = sc.nextInt();
					
					System.out.println(i+1+"번째 학생 국어:");
					st[i].kor = sc.nextInt();
					System.out.println(i+1+"번째 학생 영어:");
					st[i].eng = sc.nextInt();
					System.out.println(i+1+"번째 학생 수학:");
					st[i].math = sc.nextInt();
					
					st[i].sum = st[i].kor+st[i].eng+st[i].math;
					st[i].avg = st[i].sum/3.0;
					
				}
			}else if(select == 2) {
				for(int i=0; i<st.length;i++) {
					System.out.println("["+st[i].name+"] "+st[i].number+"  "+"국어:"+st[i].kor
							+" 영어:"+st[i].eng+" 수학:"+st[i].math+" 총점:"+st[i].sum +" 평균:"+st[i].avg);
				}
				System.out.println();
			}else if(select==3) {
				System.out.println("검색하실 학생의 번호를 입력하세요:");
				int search = sc.nextInt();
				
				for(int i=0;i<st.length;i++) {
					if(st[i].number==search) {
						System.out.println("["+st[i].name+"] "+st[i].number+"  "+"국어:"+st[i].kor
								+" 영어:"+st[i].eng+" 수학:"+st[i].math+" 총점:"+st[i].sum +" 평균:"+st[i].avg);
					}
				}
				System.out.println();
			}else if(select == 4) {
				
			}
		}
		
		
		
		
		
		
		
		
	}

}
