package com.kh.practice6.func;

public class Member {
	// 1. 멤버변수
	String memberId;
	String memberPw;
	String memberName;
	int age;
	char gender;
	String phone;
	String email;
	
	// 2. 생성자
	/*public Member(String memberId, String memberPw, String memberName, int age, char gender, String phone, String email) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.email = email;	
	}*/
	//선생님 풀이
	public Member() {
	}
	
	// 3. 정보출력매소드
	public void changeName(String memberName) {
		this.memberName = memberName;
	}
	public void printName() {
		System.out.println(memberName + " 회원님");
	}
}
