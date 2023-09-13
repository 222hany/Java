package com.kh.api.exam1;

public class ReplaceMain {

	public static void main(String[] args) {
		ReplaceMain reMain = new ReplaceMain();
		//reMain.replace1();
		//reMain.replace2();
		//reMain.replace3();
		//reMain.replace4();
		//reMain.replace5();
		reMain.replaceAll();
	}
	
	public void replace1() {
		String input = "Hello, world!";
		String reInput = input.replace(",","-");
		System.out.println(reInput);
		
		String input2 = reInput.replace("-", "");
		System.out.println("input2 : " + input2);
	}
	
	public void replace2() {
		String input = "Hello World!";
		String reInput = input.replace("World", "Java");
		System.out.println(reInput);
	}
	
	public void replace3() {
		String originName = "Hello World";
		// o로 적혀있는 문자열들 x로 변경하기
		String reName = originName.replace("o", "x");
		System.out.println(reName);
	}
	
	public void replace4() {
		String originString = "The quick brown fox jumps over the lazy dog.";
		// 여우를 고양이로 바꾸기
		String reString = originString.replace("fox", "cat");
		System.out.println(reString);
	}
	
	public void replace5() {
		String originString = "The quick brown fox jumps over the lazy dog.";
		// 모든 공백 제거하기
		String reString = originString.replace(" ", "");
		System.out.println(reString);
	}
	
	public void replaceAll() {
		String originString = "Hello World";
		// replace 대신에 replaceAll 이용해서 대소문자 구분없이 문자열 치환하기
		String reAllString = originString.replaceAll("(?i)hello", "Hell");
		System.out.println(reAllString);
	}

}
