package com.kh.finalSample;

import java.io.FileWriter;

public class FileIOMain {
	public static void main(String[] args) {
		try {
			FileWriter fw = null;
			fw = new FileWriter("file.txt",true); // 2번째 인자의 값이 boolean true로 지정되면 해당 파일에 이어쓰기
			fw.write(1000);
			fw.write(10000);
			fw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
