package com.kh.IAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressMain {
	public static void main(String[] args) {
		InetAddressMain inet = new InetAddressMain();
		//inet.InetExam();
		inet.InetSample();
	}
	
	public void InetExam() {
		try {
			// 호스트 이름 이용해서 객체 생성
			InetAddress address = InetAddress.getByName("www.google.com");
			
			// IP주소 출력
			System.out.println("Host Name : " + address.getHostName());
			System.out.println("IP Address : " + address.getHostAddress());
			
			System.out.println("===========================");
			
			// 호스트 2
			InetAddress address2 = InetAddress.getByName("www.naver.com");
			System.out.println("Host Name : " + address2.getHostName());
			System.out.println("IP Address : " + address2.getHostAddress());
			
			System.out.println("===========================");
			
			// 호스트 3
			InetAddress address3 = InetAddress.getByName("www.daum.net");
			System.out.println("Host Name : " + address3.getHostName());
			System.out.println("IP Address : " + address3.getHostAddress());
			
			System.out.println("===========================");
			
			// 현재 호스트(내가 사용하는 컴퓨터)의 InetAddress 객체 얻기
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println("Local Host Name : " + localHost.getHostName());
			System.out.println("Local IP Address : " + localHost.getHostAddress());
		
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
	
	public void InetSample() {
		// 호스트 이름 가져와서 객체 생성
		try {
			InetAddress address = InetAddress.getByName("www.naver.com");
			
			// IP주소를 Byte 배열로 얻기
			// InetAddress 객체에서 IP주소를 바이트 배열로 얻음
			// IP주소를 바이트 배열로 얻으면 각 바이트를 통해 IP주소를 다룰 수 있음
			byte[] ipAddress = address.getAddress();
			System.out.println("IP Address byte로 얻음");
			for(byte ip : ipAddress) {
				System.out.print(ip + ".");
			}
			System.out.println();
			
			// 도메인 명에 지정된 모든 호스트의 IP주소를 배열로 얻기
			InetAddress[] alladdress = InetAddress.getAllByName("www.google.com");
			System.out.println("구글에 지정 된 모든 호스트의 IP주소를 배열로 얻음");
			for(InetAddress addr : alladdress) {
				System.out.println(addr.getHostAddress());
			}
			
			// 호스트 이름 얻기
			String hostName = address.getHostName();
			System.out.println("Host Name : " + hostName);
			
			// 지역 호스트의 IP주소 얻기
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println("Local Host Address : " + localHost.getHostAddress());
			
			// 멀티 캐스트 주소 여부 확인
			boolean isMultiCast = address.isMulticastAddress();
			System.out.println("멀티 캐스트 주소입니까? : " + isMultiCast);
			
			// 호스트 이름을 이용하여 InetAddress 객체 생성
			InetAddress name = InetAddress.getByName("www.daum.net");
			System.out.println("IP 주소 이름 : " + name.getHostAddress());
			
			// 호스트의 완전한 이름 가져오기(전체 도메인 이름)
			// 호스트의 정규화 된(FQDN) 도메인의 이름을 얻음
			// *FQDN : Full Qualified Domain Name
			String hostFullName = address.getCanonicalHostName();
			System.out.println("풀네임 : " + hostFullName);
			
			// LookPack 주소 여부 확인
			boolean isLookPack = address.isLoopbackAddress();
			System.out.println("룩팩인가요? : " + isLookPack);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
