package com.kh.api.exam1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateMain {
// Date : 날짜와 시간정보를 나타내는데 사용. java1.1 이후 사용되지 않음.
// java.time 패키지 LocalDate LocalTime LocalDateTime
	public static void main(String[] args) {
		/*
		// import java.time.LocalDate;
		LocalDate currentDate = LocalDate.now();
		System.out.println("LocalDate : " + currentDate);
		
		// LocalTime
		LocalTime currentTime = LocalTime.now();
		System.out.println("LocalTime : " + currentTime);
		
		// LocalDateTime
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("LocalDateTime" + currentDateTime);
		
		// 날짜 계산
		LocalDate today = LocalDate.now();
		LocalDate futureDate = today.plusDays(7);
		System.out.println("7일후 : " + futureDate);
		
		
		// minus, plus 각각 2개씩 만들기
		LocalDate now = LocalDate.now();
		System.out.println("오늘 날짜 : " + now);
		LocalDate couponExp1 = now.plusDays(2);
		LocalDate couponExp2 = now.plusDays(4);
		System.out.println("쿠폰소멸예정 : " + couponExp1);
		System.out.println("쿠폰소멸예정 : " + couponExp2);
		
		LocalDate update = now.minusDays(2);
		LocalDate update2 = now.minusDays(4);
		System.out.println("마지막 업데이트일 : " + update);
		System.out.println("마지막 업데이트일 : " + update2);
		*/
		
		// 특정 날짜 시간 생성
		LocalDate date1 = LocalDate.of(2023, 9, 13);
		LocalDate date2 = LocalDate.of(2023, 9, 13);
		
		// 날짜 비교
		if(date1.isBefore(date2)) {
			System.out.println(date2 + " 는 미래");
		} else if(date1.isAfter(date2)) {
			System.out.println(date2 + "는 과거");
		} else {
			System.out.println(date1 + " 과 " + date2 + " 는 같은날");
		}
		
	}

}
