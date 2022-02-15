package com.xworkz.injection_spring.passport.entity.contants;

public enum VerifiedDocument {

	AADHAR('A'), PAN('P'), VOTER('V');

	private char documentValue;

	private VerifiedDocument(char documentValue) {
		System.out.println(this.getClass().getSimpleName().concat(" ENUM class is Invoked"));
	}

	public char getDocumentValue() {
		return documentValue;
	}

	public void setDocumentValue(char documentValue) {
		this.documentValue = documentValue;
	}

}
