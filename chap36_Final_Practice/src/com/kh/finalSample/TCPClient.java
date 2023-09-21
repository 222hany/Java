package com.kh.finalSample;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {
	public static void main(String[] args) throws UnknownHostException {
		int port = 1234;
		String serverIP; // 내 IP주소
		
		serverIP = InetAddress.getLocalHost().getHostAddress();
		System.out.println(serverIP);
		
		try {
			serverIP = InetAddress.getLocalHost().getHostAddress();
			System.out.println("server IP");
			Socket socket = new Socket(serverIP, port);
			System.out.println("server connect");
			
			// 클라이언트와 통신을 위한 입출력 스트림 생성
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			OutputStream output = socket.getOutputStream();
			
			// 클라이언트에서 서버로 메세지 전송
			String msg = "Hi, Server.";
			output.write(msg.getBytes());
			output.flush();
			socket.close();
			
			}catch(Exception e) {
				e.printStackTrace();
			}
	}
}
