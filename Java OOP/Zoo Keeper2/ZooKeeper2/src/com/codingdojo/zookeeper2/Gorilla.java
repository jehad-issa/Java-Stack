package com.codingdojo.zookeeper2;
public class Gorilla extends Mammal {
	
	public Gorilla (int energyLevel) {
		this.energyLevel = energyLevel;
	}
	public Integer throwSomething() {
		System.out.println("the gorilla throw something");
		energyLevel -= 5;
		return energyLevel;
	}
	
	public Integer eatBananas() {
		System.out.println("the gorilla eat banana");
		energyLevel += 10;
		return energyLevel;
	}
	
	public Integer climb() {
		System.out.println("the gorilla climb tree");
		energyLevel -= 10;
		return energyLevel;
	}
}
