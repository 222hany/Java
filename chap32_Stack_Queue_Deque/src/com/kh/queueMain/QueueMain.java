package com.kh.queueMain;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {

	public static void main(String[] args) {
		// 큐 생성
		Queue<String> queue = new LinkedList<>();
		
		// 큐에 요소추가		    front↓		     rear↓
		queue.offer("Apple"); // +---+   +---+   +---+
		queue.offer("Banana");// | 1 | ← | 2 | ← | 3 |
		queue.offer("Cherry");// +---+   +---+   +---+
		
		// 큐에서 요소 추출 및 출력(FIFO순서)
		String removedElement = queue.poll(); // 큐에서 Apple 제거 하고 반환
		System.out.println(removedElement);
		
		removedElement = queue.poll(); // 큐에서 Banana 제거 하고 반환
		
		// 큐의 Front 요소 확인
		String frontElement = queue.peek(); // 큐의 프론트요소 Cherry 반환
		
		// 큐의 크기 확인
		int size = queue.size();
		System.out.println(size);
		
		while(!queue.isEmpty()) {
			String element = queue.poll();
			System.out.println(element);
		}
		
	}

}
