package com.kh.finalSample;

import java.util.ArrayList;

public class MyMusic {
	// 첫 번째 방법
	// 클래스 만들어서 객체 생성하고 getter 생성하기.
	
	public void runMusic() {
		ArrayList<Music> list = new ArrayList<Music>();
		list.add(new Music("발라드", "슬픔"));
		list.add(new Music("댄스", "신남"));
		list.add(new Music("락", "시끄러움"));
		
		for(int i = 0; i <= list.size(); i++) {
			System.out.println(list.get(i));
			
			// 두 번째 방법
			Music m = list.get(i);
			System.out.println(m.getGenre() + ", " + m.getMood());
		}
	}
}
