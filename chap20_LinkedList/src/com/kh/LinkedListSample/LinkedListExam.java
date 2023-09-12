package com.kh.LinkedListSample;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {

	public static void main(String[] args) {
		// List 인터페이스와 LinkedList 객체 활용
		List<String> linkedList = new LinkedList<>();
		// String 값넣기
		linkedList.add("가나다");
		linkedList.add("abc");
		linkedList.add("123");
		System.out.println("생성 후 : " + linkedList);
		// 수정
		linkedList.set(1, "라마바");
		System.out.println("수정 후 : " + linkedList);
		// 삭제
		linkedList.remove(2);
		// 최종 출력
		System.out.println("삭제 후 : " + linkedList);
		
		// LinkedList 객체 new LinkedList 객체 활용
		List<Integer> intList = new LinkedList<>();
		// int 값넣기
		intList.add(1);
		intList.add(2);
		intList.add(3);
		System.out.println("생성 후 : " + intList);
		// 수정
		intList.set(2, 5);
		System.out.println("수정 후 : " + intList);
		// 삭제
		intList.remove(1);
		// 최종 출력
		System.out.println("삭제 후 : " + intList);
	}

}
