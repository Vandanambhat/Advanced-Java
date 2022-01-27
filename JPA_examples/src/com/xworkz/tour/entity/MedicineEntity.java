package com.xworkz.tour.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="medicine_table")
public class MedicineEntity {

	@Id
	@Column(name = "m_id")
	private int id;
	@Column(name = "m_name")
	private String name;
	@Column(name = "m_type")
	private String type;
	@Column(name = "m_brand")
	private String brand;
	@Column(name = "m_available")
	private boolean available;

	public MedicineEntity() {
		// TODO Auto-generated constructor stub
	}

	public MedicineEntity(int id, String name, String type, String brand, boolean available) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.brand = brand;
		this.available = available;
	}

	@Override
	public String toString() {
		return "MedicineEntity [id=" + id + ", name=" + name + ", type=" + type + ", brand=" + brand + ", available="
				+ available + "]";
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
		MedicineEntity other = (MedicineEntity) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	
	
	

}