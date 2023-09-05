package com.kh.gettersetter;

public class PlayerCharacter {
	private String name; // 캐릭터 이름
	private int health; // 체력
	private int attackPower; // 공격력
	
	// getter 데이터 복사본을 던져주기 때문에 원래 객체의 데이터는 손상시키지 않음. 원본 데이터는 안전함.
	public String getName() {
		return name;
	}
	public int getHealth() {
		return health;
	}
	public int getAttackPower() {
		return attackPower;
	}
	
	// setter 외부에서 매소드를 통해 데이터에 접근을 하게 된다면 매소드는 매개값(매개변수)을 검증해서 유효한 값만 데이터로 저장.
	public void setName(String name) {
		this.name = name;
	}
	public void setHealth(int health) {
		if (health >= 1) { // 체력이 1보다 클 경우.
			this.health = health;
		} else {
			System.out.println("체력이 없습니다...");
		}
		
	}
	public void setAttackPower(int attackPower) {
		if (attackPower >= 1) {
			this.attackPower = attackPower;	
		} else {
			this.attackPower = 0; // 0 미만의 값을 넣어도 0 이하의 값이 출력되지 않음.
			System.out.println("공격력이 부족합니다.");
		}
	}
	
	// 캐릭터 정보 출력
	public void diplayInfo() {
		System.out.println("캐릭터 정보 : " + name);
		System.out.println("체력 정보 : " + health);
		System.out.println("공격력 정보 : " + attackPower);
	}
	// 캐릭터 공격하는 출력 매소드
	public void attack() {
		System.out.println("공격 했습니다.");
	}
	// 다른 캐릭터로부터 공격받았을때 매소드
	public void damage() {
		System.out.println("공격 당했습니다.");
	}
}
