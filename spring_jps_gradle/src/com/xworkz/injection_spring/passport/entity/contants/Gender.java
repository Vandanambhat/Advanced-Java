package com.xworkz.injection_spring.passport.entity.contants;

public enum Gender {

	MALE('M'), FEMALE('F'), OTHERS('O');

	private char value;

	Gender(char value) {
		this.value = value;
		System.out.println(this.getClass().getSimpleName().concat(" ENUM class is Invoked"));
	}

	public char getValue() {
		return value;
	}

	public void setValue(char value) {
		this.value = value;
	}

}
