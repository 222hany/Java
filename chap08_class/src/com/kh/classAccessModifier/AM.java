package com.kh.classAccessModifier;

public class AM {
	public int pNum = 10;
	protected int pNum2 = 20;
	// default int pNum3 = 30; // 접근제한자를 명시하지 않으면 자동으로 디폴트
	int pNum3 = 30;
	private int pNum4 = 40;
	
	// 호출 메소드를 작성해서 각각 호출하기
	public void publicMethod() {
		System.out.println("public Method() 호출됨 / 어떤 클래스에서든 접근이 가능");
	}
	
	protected void protectedMethod() {
		System.out.println("protected Method() 호출됨 / 같은 패키지 내에서는 접근 가능");
	}
	
	/*default void defaultMethod() { // default는 앞에 접근제한자를 작성해 주지 않으면 기본으로 적용이 됨.
		System.out.println("default Method() 호출됨");
	}*/
	
	void defaultMethod() {
		System.out.println("default Method() 호출됨 / 같은 패키지 내에서만 접근 가능");
	}
	
	private void privateMethod() {
		System.out.println("private Method() 호출됨 / 같은 클래스 내에서만 접근이 가능");
	}
}
