package com.kh.InterfaceSample;

public class InterfaceMain {

	public static void main(String[] args) {
	  //MyInterface 변수명 = new MyInterface(); // 안되는 이유 : MyInterface는 객체가 아니기때문에 생성할 수 없음.
		MyInterface myin = new MyClass();
		myin.doMyInterface();
		
	}

}
