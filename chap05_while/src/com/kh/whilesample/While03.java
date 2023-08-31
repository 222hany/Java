package com.kh.whilesample;

public class While03 {

	public static void main(String[] args) {
		// 반복적으로 출력
		int i = 1;
		while (i <= 10) { // i가 10보다 작거나 같을 때 true.
			System.out.println(i); // 위 부등호가 참일 경우 출력.
			i = ++i;
			/*
			i++ 일 때 i가 1인 값을 먼저 대입했기 때문에 ++가 작동하지 않음. 무한루프 발생.
			++i 일 때는 i에 +1을 먼저 대입 1~10까지 출력가능. 무한루프가 발생하지 않음.
			*/
		}

	}

}
