package com.kh.practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PracticeMain {
	public static void main(String[] args) {
		PracticeMain pm = new PracticeMain();
		//pm.PracticeStack();
		pm.PracticeQueue();
	}
	
	public void PracticeStack() {
		// stack에 값을 저장하고 삭제하고 초기화 등 매서드 사용해보기
		Stack<String> stack = new Stack<>();
				
		// 값 저장
		stack.push("이하니");
		stack.push("이한솔");
		stack.push("이한빛");
		stack.push("이지원");
		stack.push("이가을");
				
		// 크기 확인
		System.out.println(stack.size()); // 5개
				
		// 삭제(LIFO)
		System.out.println(stack.pop()); // 이가을
		System.out.println(stack.pop()); // 이지원
				
		// 상단 값 출력
		System.out.println(stack.peek()); // 이가을, 이지원 삭제 후(가장 최근 값 : 이한빛)
				
		// 이하니 확인
		System.out.println(stack.contains("이하니")); // 들어있으면 true 아니면 false
				
		// 전체 초기화
		stack.clear(); // 전부 삭제
				
		// 공간 확인
		System.out.println(stack.empty()); // 비어있으면 true 들어있으면 false
	}
	
	public void PracticeQueue() {
		// 큐에 요소 추가, 반환, 삭제하고 while문 사용해보기
		Queue<Integer> queue = new LinkedList<>();
		
		// 요소 추가
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		
		// 큐 크기 확인
		int size = queue.size();
		System.out.println(size); // 3개
		
		// 요소 추출하고 출력(FIFO)
		int removedElement = queue.poll(); // 제일 먼저 넣은 1 출력
		System.out.println(removedElement);
		
		// 큐의 프론트요소 확인하기
		int frontElement = queue.peek(); // 1 제거 후 2가 프론트 요소가 됨
		System.out.println(frontElement);
		
		// while문을 사용해 전체 출력
		while(!queue.isEmpty()) { // 1 제거 후 먼저 넣은 순서대로 2와 3출력
			int element = queue.poll();
			System.out.println(element);
		}
	}

}
