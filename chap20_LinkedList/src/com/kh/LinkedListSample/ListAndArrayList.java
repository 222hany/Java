package com.kh.LinkedListSample;

import java.util.LinkedList;
import java.util.List;

public class ListAndArrayList {

	public static void main(String[] args) {
		// 생성
		List<String> linkedList = new LinkedList<>();
		
		// 요소추가
		linkedList.add("첫 번째");
		linkedList.add("두 번째");
		linkedList.add("세 번째");
		
		System.out.println("linked list : " +  linkedList);
		
		// 요소삭제
		linkedList.remove(2); // 세 번째 요소 삭제
		System.out.println("삭제 후 : " + linkedList);
		
		// 요소검색
		boolean isTrue = linkedList.contains("두 번째");
		System.out.println("두 번째 요소 포함 여부 : " + isTrue);
		
		// 요소개수
		int size = linkedList.size();
		System.out.println("크기 : " + size);
	}

}
