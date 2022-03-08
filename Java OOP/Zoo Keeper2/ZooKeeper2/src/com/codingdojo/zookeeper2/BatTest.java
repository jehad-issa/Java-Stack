package com.codingdojo.zookeeper2;

public class BatTest {

	public static void main(String[] args) {
		Bat bat1 = new Bat(300);
		
		bat1.attackTown();
		bat1.attackTown();
		bat1.attackTown();
		bat1.displayEnergy();
		
		bat1.eatHumans();
		bat1.eatHumans();
		bat1.displayEnergy();

		
		bat1.fly();
		bat1.fly();
		bat1.displayEnergy();
		
	}

}
