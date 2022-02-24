package com.xworkz.injection_spring.passport.entity.contants;

public enum PassportPersonnelType {

	REGULAR('R'), DIPLOMATIC('D');

	private char value;

	private PassportPersonnelType(char value) {
		System.out.println(this.getClass().getSimpleName().concat(" is invoked"));
	}

	public char getValue() {
		return value;
	}

	public void setValue(char value) {
		this.value = value;
	}

}
