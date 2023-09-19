package com.kh.stackMain;

import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		// push() : 스택에 값 추가
		stack.push(1); // |       |
		stack.push(2); // |   3   |
		stack.push(3); // |   2   | 
					   // |___1___|

		// pop() : 스택 값 삭제
		System.out.println(stack.pop()); //3
		System.out.println(stack.pop()); //2
		// clear() : 스택 전체 값 제거(초기화)
		stack.clear();
		// peek() : 스택 가장 상단의 값 출력(가장 마지막에 넣은 값)
		stack.peek();
		// 스택 크기 출력
		stack.size();
		// 스택 공간 확인(비어있으면 true, 하나라도 들어있다면 false)
		stack.empty();
		// 스택에 1이 있는지 확인(1이 존재라면 true, 없으면 false)
		stack.contains(1);
	}

}
