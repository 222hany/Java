package com.kh.inheritance.animal;

public class Cat extends Animal{
	public Cat(String name) {
		super(name); // 상위 클래스(Animal)의 멤버변수에 접근하는데 사용.
		}
	
	public void run() {
		System.out.println(getName() + " 주인이 와서 달린다!");
	}
	@Override // Animal에 적혀있는 eat을 고양이 안에서만 다시 정의를 내린다.
	public void eat() {
		System.out.println(getName() + "가(이) 먹이통을 뺐어먹습니다.");
	}
}
