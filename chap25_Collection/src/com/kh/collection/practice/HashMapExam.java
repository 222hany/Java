package com.kh.collection.practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapExam {

	public static void main(String[] args) {
		// HashMap ����
		Map<String, Integer> studentGrades = new HashMap<>();
		
		//�л��� ������ �߰��ϰڽ��ϴ�.
		studentGrades.put("KH", 95);
		studentGrades.put("Park", 80);
		studentGrades.put("David", 77);
		studentGrades.put("Bob", 92);
		studentGrades.put("Bob", 72);
		// containsValue containsKey �⺻������ boolean �������� �Ǿ� ����
		System.out.println(studentGrades.containsValue(92));
		System.out.println(studentGrades.containsKey("Bob"));
		//true false
		
		
		//Ư�� �л��� ���� �˻�
		//Map containsKey : �ʿ��� key(Ű), value(��) �� �ִ��� Ȯ��
		String studentName = "ssss";
		//int studentScore = 1;
		//���࿡ �л��� �߿��� Bob �ִٸ� ������ ������
		if (studentGrades.containsKey(studentName)) {//true false
			
			//String ss = studentGrades.get(studentName);
			
			int grade = studentGrades.get(studentName);
			System.out.println(studentName + "�� ���� : " + grade);
		} else {
			System.out.println(studentName + " �� ������ ã�� �� �����ϴ�.");
		}
		
		/*
		 * 		 Map.Entry �������̽��� �Բ� ���Ǵ� �������̽�
		 getKey()  : ��ü�� Ű�� ��ȯ
		 getValue(): ��ü�� ���� ��ȯ
		 * */
		//��� �л��� ������ ���
		for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
			String name = entry.getKey();
			int grade = entry.getValue();
			System.out.println(name + " : " + grade);
		}
		
		//�л� ���� ����
		String StudentUpdate = "Bob";
		int newGrade = 98;
		studentGrades.put(StudentUpdate, newGrade);
		System.out.println(studentGrades + "�� ������ " + newGrade + "�� �����߽��ϴ�.");
		//System.out.println(StudentUpdate + "�� ������ " + newGrade + "�� �����߽��ϴ�.");
		
		
		//�л� ����
		String removeStudent = "David";
		studentGrades.remove(removeStudent);
		
		System.out.println(removeStudent + " �� ������ �����߽��ϴ�.");
		
		//���� �л� ���� ���
		System.out.println("���� �л� ���� : ");
		for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
			String name = entry.getKey();
			int grade = entry.getValue();
			System.out.println(name + " : " + grade);
		}
	}

}