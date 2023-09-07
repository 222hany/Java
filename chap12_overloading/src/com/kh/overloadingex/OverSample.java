package com.kh.overloadingex;
//ÀÚ¹ÙÆÄÀÏ ¸¸µé±â OverSample.java
//¿À¹ö·Îµù 5°³ ¸¸µé°í Ãâ·Â
public class OverSample {
	public int add(int a, int b) {
		return a + b;
	}
	public int sub(int a, int b) {
		return a - b;
	}
	public int mul(int a, int b) {
		return a * b;
	}
	public int div(int a, int b) {
		return a / b;
	}
	public int div2(int a, int b) {
		return a % b;
	}

	public static void main(String[] args) {
		OverSample obj = new OverSample();
		
		System.out.println("µ¡¼À : " + obj.add(10, 5));
		System.out.println("»¬¼À : " + obj.sub(10, 5));
		System.out.println("°ö¼À : " + obj.mul(10, 5));
		System.out.println("³ª´°¼À ¸ò : " + obj.div(10, 5));
		System.out.println("³ª´°¼À ³ª¸ÓÁö : " + obj.div2(10, 5));
	}

}
