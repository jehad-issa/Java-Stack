package com.codingdojo.zookeeper1;

public class Mammal {
	protected int energyLevel = 100;
	public Integer displayEnergy() {
		System.out.println(this.energyLevel);
		return energyLevel;
	}

}
