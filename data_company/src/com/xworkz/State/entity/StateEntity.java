package com.xworkz.State.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "state_details")
public class StateEntity {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name="noOfDistricts")
	private int noOfDistricts;
	@Column(name="capitalCity")
	private String capitalCity;

	public StateEntity() {
		System.out.println("Invoked no-arg Constructor");
	}

	public StateEntity(int id, String name, int noOfDistricts, String capitalCity) {
		super();
		this.id = id;
		this.name = name;
		this.noOfDistricts = noOfDistricts;
		this.capitalCity = capitalCity;
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

	public int getNoOfDistricts() {
		return noOfDistricts;
	}

	public void setNoOfDistricts(int noOfDistricts) {
		this.noOfDistricts = noOfDistricts;
	}

	public String getCapitalCity() {
		return capitalCity;
	}

	public void setCapitalCity(String capitalCity) {
		this.capitalCity = capitalCity;
	}

	@Override
	public String toString() {
		return "StateEntity [id=" + id + ", name=" + name + ", noOfDistricts=" + noOfDistricts + ", capitalCity="
				+ capitalCity + "]";
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
		StateEntity other = (StateEntity) obj;
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
