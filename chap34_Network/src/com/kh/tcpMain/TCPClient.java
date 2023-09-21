package com.kh.tcpMain;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
	public static void main(String[] args) throws Exception {
			// 서버주소와 포트 번호로 소켓 생성
			// 서버주소와 포트 번호는 내가 연결하고자 하는 포트와 동일해야 함
			Socket socket = new Socket("localhost", 8080);
			System.out.println("[ Server Connect ]");
			
			// 보낼 때 코드
			OutputStream outStream = socket.getOutputStream();
			PrintStream printStream = new PrintStream(outStream);
			printStream.print("HI SERVER");
			printStream.flush();
			
			// 서버로부터 읽어옴
			InputStream inStream = socket.getInputStream();
			Scanner sc = new Scanner(inStream);
			System.out.println("[Client] server : " + sc.nextLine());
			sc.close();
			
			socket.close();
			System.out.println("BYE SERVER");
	}
}
