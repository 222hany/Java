package com.kh.dequeMain;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeMain {

	public static void main(String[] args) {
		// ArrayDeque를 사용하여 Deque 생성
		Deque<String> deque = new ArrayDeque<>();
		
		// 요소 추가                     시작↓                  끝↓ 
		deque.addFirst("First");//    [first] ↔ [second] ↔ [third]
		deque.addLast("Last");  //   ↑                            ↑
		                        // [     ]                    [     ]
		
		// 맨 앞과 맨 뒤 요소 확인
		System.out.println(deque.getFirst());
		System.out.println(deque.getLast());
		
		// 맨 앞과 맨 뒤 요소 제거
		deque.removeFirst();
		deque.removeLast();
		System.out.println(deque);
		
		// 비어있는지 확인
		System.out.println(deque.isEmpty());
	}

}
