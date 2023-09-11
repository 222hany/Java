package com.kh.instance.tv;

public class TVMain {

	public static void main(String[] args) {
		TV tv;         // TV의 인스턴스를 참조하기 위해 변수 tv를 선언.
		tv = new TV(); // TV 인스턴스 생성. 객체의 주소를 참조변수에 저장.
		
		tv.power();
		tv.channel = 7;   // TV 인스턴스의 멤버변수 channel의 값을 7로 설정.
		tv.channelDown(); // TV 인스턴스의 매소드 channelDown을 호출.
		
		System.out.println("Channel : " + tv.channel);
	}

}
