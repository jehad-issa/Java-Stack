package com.codingdojo.zookeeper2;

public class Mammal {
	protected int energyLevel;
	
	public Integer displayEnergy() {
		System.out.println(this.energyLevel);
		return energyLevel;
	}
}
