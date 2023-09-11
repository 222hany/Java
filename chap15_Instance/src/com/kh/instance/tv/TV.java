package com.kh.instance.tv;

public class TV { // TV 객체
	// TV 제작
	// TV의 속성(필드)
	String color;  // TV색상
	boolean power; // 전원상태
	int channel;   // 채널
	
	// TV의 기능(매소드)
	public void power() {
		power = !power; // 전원상태
	}
	public void channelUp() {
		++channel;
	}
	public void channelDown() {
		--channel;
	}
}
