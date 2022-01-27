package com.xworkz.tour.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="factory_details")
public class FactoryEntity {
	@Id
	@Column (name="id")
	private int id;
	@Column (name="name")
	private String name;
	@Column (name="type")
	private String type;
	@Column (name="location")
	private String location;
	@Column (name="no_of_employee")
	private int noOfEmployee;
	@Column (name="profit")
	private int profit;
	
	public FactoryEntity() {
		System.out.println("Invoked no-arg FactoryEntity");
	}

	public FactoryEntity(int id, String name, String type, String location, int noOfEmployee, int profit) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.location = location;
		this.noOfEmployee = noOfEmployee;
		this.profit = profit;
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
		FactoryEntity other = (FactoryEntity) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FactoryEntity [id=" + id + ", name=" + name + ", type=" + type + ", location=" + location
				+ ", noOfEmployee=" + noOfEmployee + ", profit=" + profit + "]";
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNoOfEmployee() {
		return noOfEmployee;
	}

	public void setNoOfEmployee(int noOfEmployee) {
		this.noOfEmployee = noOfEmployee;
	}

	public int isProfit() {
		return profit;
	}

	public void setProfit(int profit) {
		this.profit = profit;
	}
	

}