package com.kh.gettersetter.goodExam;

public class GoodPlayer {
	
		private String name;   		//캐릭터이름
		private   int  health; 		//체력
		private   int  attackPower; //공격파워
		
		
		public void setName(String name) {  // 이름이 변경되면 저장 될 set
			this.name = name;
		}
		public void ValidName() {  // 캐릭터 이름에 공백이 있는지 검증
			if (this.name == "") {
				this.name = "No name";
				//System.out.println("이름을 넣지 않았습니다.");
			}
		}
		public String getName() {  // 캐릭터 이름을 반환
			return name;
		}
		
		
		public void setHealth(int health) {
			this.health = health;
		}
		public void ValidHealth() {
			if (this.health <= 0) {
				this.health = 0;
				//System.out.println("체력이 없습니다...");
			}
		}
		public int getHealth() {
			return health;
		}
		
		
		public void setAttackPower(int attackPower) {
			this.attackPower = attackPower;
		}
		public void ValidAttackPower() {
			if (this.attackPower <= 0) {
				this.attackPower = 0;
				//System.out.println("공격력이 부족합니다...");
			}
		}
		public int getAttackPower() {
			return attackPower;
		}
		
		
		public void displayInfo () {  // 출력 매소드 작성
			System.out.println("캐릭터 정보 : " + this.name);
			System.out.println("체력 정보 : " + this.health);
			System.out.println("공격력 정보 : " + this.attackPower);
		}
		
}
