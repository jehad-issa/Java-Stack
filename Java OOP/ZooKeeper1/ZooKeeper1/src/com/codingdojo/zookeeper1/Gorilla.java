package com.codingdojo.zookeeper1;
public class Gorilla extends Mammal {
	public Integer throwSomething() {
		System.out.println("The Gorilla throw something");
		energyLevel -=5;
		return energyLevel;
	}
	public Integer eatBananas() {
		System.out.println("The Gorilla eat banana");
		energyLevel +=10;
		return energyLevel;
	}
	public Integer climb() {
		System.out.println("The Gorilla clinbing tree");
		energyLevel -=10;
		return energyLevel;
	}
	
}
