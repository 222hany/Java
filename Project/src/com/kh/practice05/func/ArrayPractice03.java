package com.kh.practice05.func;

public class ArrayPractice03 {

	public static void main(String[] args) {
		// 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고 배열의 크기만큼 사용자가 직접 값을
		// 입력하여 각각의 인덱스에 값을 초기화. 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력.
		int[] array = new int [5];
		array[0] = 4;
		array[1] = -4;
		array[2] = 3;
		array[3] = -3;
		array[4] = 2;
		
		int sum = array[0]+array[1]+array[2]+array[3]+array[4];
		
		for (int i = 0; i < array.length; i++) {
		System.out.println(array[i]);
		}
		System.out.println("총합 : " + sum);

	}

}
