package com.xworkz.injection_spring.passport.entity.contants;

public enum BloodGroup {

	A_POSITIVE("A+"), B_POSITIVE("B+"), O_POSITIVE("O+"), A_NEGATIVE("A-"), B_NEGATIVE("B-"), O_NEGATIVE("O-"),
	AB_POSITIVE("AB+"), AB_NEGATIVE("AB-");

	private String value;

	private BloodGroup(String value) {
		System.out.println(this.getClass().getSimpleName().concat(" ENUM class is Invoked"));
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
