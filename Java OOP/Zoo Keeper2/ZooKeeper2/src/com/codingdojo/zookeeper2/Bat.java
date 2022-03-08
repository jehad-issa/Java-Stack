package com.codingdojo.zookeeper2;
public class Bat extends Mammal {
	public Bat (int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public Integer fly() {
		System.out.println("Bat fly");
		energyLevel -= 50;
		return energyLevel;
	}
	
	public Integer eatHumans() {
		System.out.println("Bat eat humans");
		energyLevel += 25;
		return energyLevel;
	}
	
	public Integer attackTown() {
		System.out.println("Bat attak town");
		energyLevel -= 100;
		return energyLevel;
	}
}
