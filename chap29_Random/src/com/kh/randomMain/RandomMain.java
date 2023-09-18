package com.kh.randomMain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Random : 난수를 생성하기 위해 사용되는 클래스.
//			*난수 : 무작위로 만들어진 수.
public class RandomMain {

	public static void main(String[] args) {
		RandomMain rm = new RandomMain();
		rm.Lotto();
		//rm.RandomExam();
	}
	
	public void Lotto() {
		// 로또번호 생성기
		Random rd = new Random(); // 랜덤 객체 생성
		
		// ArrayList 사용해서 장바구니로 담기
		List<Integer> lottoNum = new ArrayList<>();
		
		// 여섯 숫자만 들어갈 것
		int six = 6; // 로또 번호 몇 개 뽑을 것인지 설정
		while(lottoNum.size() < 6) { // 0,1,2,3,4,5
			int ranNum = rd.nextInt(45); // 0 ~ 44 범위 난수 하나 생성
			int addNum = ranNum + 1; // 0(+1)~44(+1) = 1 ~ 45 범위 설정.
			if(!lottoNum.contains(addNum)) { // 존재하는지 여부 확인(중복 처리)
				lottoNum.add(addNum); // !가 사라지면 값이 존재할 때만 list에 저장되는 것이기 때문에 무한루프
			}
		}
		System.out.println("로또 번호 : " + lottoNum);
	}
	
	public void RandomExam() {
		Random rd = new Random(); // 랜덤 객체 생성
		
		// 1. 정수 범위 내에서 랜덤인 난수를 만들기
		int ranInt = rd.nextInt(100); // 0 ~ 99 사이에서 1개의 수를 생성.
		System.out.println(ranInt);
		
		// 2. 실수 범위 내에서 랜덤인 난수를 만들기
		double ranD = rd.nextDouble(); // 0.0 ~ 1.0
		System.out.println(ranD);
		
		// 3. boolean 값 랜덤으로 생성
		boolean ranB = rd.nextBoolean();
		System.out.println(ranB);
	}
	
}
