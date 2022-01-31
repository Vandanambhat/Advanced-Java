package com.xworkz.animation;

public class Laptop {

	public String name="Khajal";
	
	public Laptop() {
		System.out.println(getClass().getSimpleName().concat("Invoked no-arg constr"));
	}

	public void play() {
		System.out.println("Created ref without instance");
	}

}
