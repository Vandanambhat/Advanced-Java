package com.xworkz.animation;

public class AnimeCharacter {
	private String character;
	private String gender;

	public AnimeCharacter() {
		System.out.println(getClass().getSimpleName().concat("Invoked no-arg constr"));
	}

	public AnimeCharacter(String character,String gender) {
		super();
		this.character = character;
		this.gender = gender;
		System.out.println(character);
		System.out.println(gender);
	}
//	public String getCharacter() {
//		return character;
//	}
//
//	public String getGender() {
//		return gender;
//	}

	public void setCharacter(String character) {
		this.character = character;
		System.out.println(character);
	}

	public void setGender(String gender) {
		this.gender = gender;
		System.out.println(gender);
	}

	public void play() {
		System.out.println("Created ref without instance");
	}
}
