package com.xworkz.Patient.entity;

public class PatientEntity {

	private int id;
	private String name;
	private String birthPlace;
	private String corona;
	private int age;
	private int buNo;
	
	public PatientEntity() {
		System.out.println("Invoked no-arg constructor");
	}

	public PatientEntity(int id, String name, String birthPlace, String corona, int age, int buNo) {
		super();
		this.id = id;
		this.name = name;
		this.birthPlace = birthPlace;
		this.corona = corona;
		this.age = age;
		this.buNo = buNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getCorona() {
		return corona;
	}

	public void setCorona(String corona) {
		this.corona = corona;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getBuNo() {
		return buNo;
	}

	public void setBuNo(int buNo) {
		this.buNo = buNo;
	}

	@Override
	public String toString() {
		return "PatientEntity [id=" + id + ", name=" + name + ", birthPlace=" + birthPlace + ", corona=" + corona
				+ ", age=" + age + ", buNo=" + buNo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PatientEntity other = (PatientEntity) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
