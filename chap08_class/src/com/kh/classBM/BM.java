package com.kh.classBM;

import com.kh.classAccessModifier.AM;

public class BM extends AM {

	//public static void main(String[] args) { // 자바프로그램의 시작점
	     
	     // A 생성자를 class BM 에서 만들기
		 //AM am = new AM();
		 
	public void main() {
		 publicMethod();
		 protectedMethod(); // 같은 패키지 내에서는 접근가능. 다른 패키지에서는 해당 클래스를 상속한 하위 클래스만 접근가능.
		                       // main 매소드에서 직접호출 하거나 뭔가를 통해 호출.
		                       // 접근제한자를 가지고 있어서 같은 패키지 내에서 접근이 가능하지만 extends를 사용해서 호출.
		 //am.defaultMethod(); // 같은 패키지 내에서만 접근가능. 다른 패키지 이므로 사용이 안됨.
	}

}
