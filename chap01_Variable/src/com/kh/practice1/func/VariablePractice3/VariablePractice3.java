package com.kh.practice1.func.VariablePractice3;
import java.util.Scanner;

public class VariablePractice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Ű����� ����,���� ���� �Ǽ������� �Է� �޾� �簢���� ������ �ѷ��� ����Ͽ� ����ϼ���.
		
		double width, height;
		System.out.print("������ ���̴�?");
		width = sc.nextDouble();
		System.out.print("������ ���̴�?");
		height = sc.nextDouble();
		
		System.out.println("������ " + width*height + " �Դϴ�.");
		System.out.println("�ѷ��� " + (width+height)*2 + " �Դϴ�.");
	}

}
