package com.kh.practice;

import java.io.File;

public class PracticeCopy {

	public static void main(String[] args) {
		
	}
	public void practice1() {
		String filePath = "C:\\Users\\user1\\Desktop\\";
		String inputFile =filePath+"love.png";
		String outputFile = filePath+"RealLove.jpg";
		
		File currentFile = new File(filePath + inputFile);
		File newFile = new File(filePath + outputFile);
		if(currentFile.renameTo(newFile)) {
			System.out.println("파일 이름 변경 성공");
		} else {
			System.out.println("파일 이름 변경 실패");
		}
	}
	public void practice2() {
		//이미지파일 jpg 또는 png 파일을 바탕화면에 저장한 후 
		// 바탕화면에다가 폴더를 만들어서
		//폴더 안에 복사한 이미지 저장하기
		String inputFile ="C:\\Users\\user1\\Desktop\\cute.png";
		String newFolder = "C:\\Users\\user1\\Desktop\\img";
		//if(!newFolder) {
		String outputFile =newFolder+"\\"+"cute1.jpg";
	}
}