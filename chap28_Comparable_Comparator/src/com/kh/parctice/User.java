package com.kh.parctice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class User implements Comparator<String>{
	@Override
	public int compare(String num1, String num2) {
		if(num1.length() == num2.length()) {
			return 0;
		}
		else if(num1.length() > num2.length()) {
			return 1;
		}
		else {
			return -1;
		}
	}

	public static void main(String[] args) {
		// List와 ArrayList 생성 Comparator 정리
		List<String> str = new ArrayList<>();
		str.add("신사임당");
		str.add("이도 aka 세종대왕");
		str.add("이이");
		
		Collections.sort(str, new User());
		
		for(String s : str) {
			System.out.println(s);
		}
	}

}
