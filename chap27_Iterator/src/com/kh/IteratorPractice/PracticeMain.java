package com.kh.IteratorPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class PracticeMain {

	public static void main(String[] args) {
		// ArrayList 생성 및 요소 추가
		ArrayList<String> pptnzPL = new ArrayList<>();
		pptnzPL.add("고래");
		pptnzPL.add("사파리의 밤");
		pptnzPL.add("Freshman");
		
		// Iterator 생성
		Iterator<String> iter = pptnzPL.iterator();
		
		// Iterator를 사용하여 요소반복
		while(iter.hasNext()) {
			String pptnz = iter.next();
			System.out.println(pptnz);
		}

	}

}
