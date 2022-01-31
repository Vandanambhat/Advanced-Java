package com.xworkz.animation;

public class Corona {

	public Corona() {
		System.out.println(getClass().getSimpleName().concat("Invoked no-arg constr"));
	}

	public void play() {
		System.out.println("Created ref without instance");
	}
}
