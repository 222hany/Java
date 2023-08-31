package com.kh.whilesample;

import java.util.Scanner;

public class While02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*boolean isChoice = false;
		
		while (!isChoice) { // !를 사용하여 true로 표기
			System.out.println("계절을 선택해주세요.");
			
			int month = sc.nextInt();
			switch (month){
			   case 3: case 4: case 5: // 케이스 3개중 하나라도 참이면 출력.
		    	   System.out.println(month + "월은 봄입니다.");
		    	   System.out.println("미세먼지에 주의하세요.");
		    	   isChoice = true; // 위 !가 있을경우 참은 거짓으로 변경되고 거짓은 참으로 변경되기 때문에 true로 작성해주어
		    	                    // !를 만나 false로 변경해 while문을 종료해준다.
		    	   break; //break는 case문에서 실행하고자 하는게 종료된 후 한 번만 사용한다.
		       case 6: case 7: case 8: 
		    	   System.out.println(month + "월은 여름입니다.");
		    	   break;
		       case 9: case 10: case 11: 
		    	   System.out.println(month + "월은 가을입니다.");
		    	   break;
		       case 12: case 1: case 2: 
		    	   System.out.println(month + "월은 겨울입니다.");
		    	   break;
		       default :
		    	   System.out.println(month + "월은 잘못된 달입니다.");
			}
		}*/
		// 나이를 입력받아 성인(19~20) 청소년(14~18) 어린이(10~13)로 분류하고 출력하기. (while, switch, case 이용.)
		// 이 외의 나이는 다시입력하세요.
		
		boolean isTrue = false;
		while (!isTrue) {
			System.out.println("나이를 입력해주세요.");
			int age = sc.nextInt();
			
			switch (age) {
			      case 19 : case 20 :
			    	  System.out.println("성인입니다.");
			    	  isTrue = true;
			    	  break;
			      case 14 : case 15 : case 16 : case 17 : case 18 : 
			    	  System.out.println("청소년입니다.");
			    	  isTrue = true;
			    	  break;
			      case 10 : case 11 : case 12 : case 13 : 
			    	  System.out.println("어린이입니다.");
			    	  isTrue = true;
			    	  break;
			      default :
			    	  System.out.println("잘못된 선택입니다. 나이를 다시 입력해주세요.");
			    	  System.out.println("***********************************");
			}
		}
	}

}
