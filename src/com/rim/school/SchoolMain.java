package com.rim.school;

public class SchoolMain {

	public static void main(String[] args) {
		Student st = new Student();
		st.name="han";
		st.number=1;
		System.out.println(st.name);
		System.out.println(st.number);
		
		Student st2 = new Student();
		st2.name="jimin";
		st2.number=2;
		System.out.println(st2.name);
		System.out.println(st2.number);
		
		System.out.println("=======================");
		System.out.println("st's sum : "+st.sum);
		
		st.kor=40;
		st.eng=40;
		st.math=40;
		
		System.out.println("=======================");
		System.out.println("st's sum : "+st.sum);
		
		
	}

}
