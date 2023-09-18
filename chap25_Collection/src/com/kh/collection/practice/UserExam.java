package com.kh.collection.practice;

import java.util.HashMap;
import java.util.Map;

public class UserExam {

	public static void main(String[] args) {
		// HashMap 생성
		//containsKey. containsValue
				Map<String, Integer> studentGrades = new HashMap<>();
				
				//학생과 점수를 추가하겠습니다.
				studentGrades.put("KH", 95);
				studentGrades.put("Park", 80);
				studentGrades.put("David", 77);
				studentGrades.put("Bob", 92);
				
				//특정 학생의 성적 검색
				//Map containsKey : 맵에서 key(키), value(값) 이 있는지 확인
				String studentName = "ssss";
				//int studentScore = 1;
				//만약에 학생들 중에서 Bob 있다면 성적을 보여줘
				if (studentGrades.containsKey(studentName)) { //containsKey true false
					
					int grade = studentGrades.get(studentName);
					System.out.println(studentName + "의 성적 : " + grade);
				} else {
					System.out.println(studentName + " 의 성적을 찾을 수 없습니다.");
				}
				
				
			}

		}