package com.xworkz.animation;

public class Minister {
	public Minister() {
		System.out.println(getClass().getSimpleName().concat("Invoked no-arg constr"));
	}

	public void play() {
		System.out.println("Created ref without instance");
	}
}
