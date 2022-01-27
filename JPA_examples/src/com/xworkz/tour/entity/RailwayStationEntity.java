package com.xworkz.tour.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="railway_station_details")

public class RailwayStationEntity {
	@Id
	@Column (name="r_id")
	private int id;
	@Column (name="r_name")
	private String name;
	@Column (name="r_no_of_platform")
	private int noOfPlatform;
	@Column (name="r_source")
	private String source;
	@Column (name="r_destination")
	private String destination;
	@Column (name="r_employee")
	private int employee;
	
	public RailwayStationEntity() {
		// TODO Auto-generated constructor stub
	}

	public RailwayStationEntity(int id, String name, int noOfPlatform, String source, String destination, int employee) {
		super();
		this.id = id;
		this.name = name;
		this.noOfPlatform = noOfPlatform;
		this.source = source;
		this.destination = destination;
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "RailwayEntity [id=" + id + ", name=" + name + ", noOfPlatform=" + noOfPlatform + ", source=" + source
				+ ", destination=" + destination + ", employee=" + employee + "]";
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
		RailwayStationEntity other = (RailwayStationEntity) obj;
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

	public int getNoOfPlatform() {
		return noOfPlatform;
	}

	public void setNoOfPlatform(int noOfPlatform) {
		this.noOfPlatform = noOfPlatform;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getEmployee() {
		return employee;
	}

	public void setEmployee(int employee) {
		this.employee = employee;
	}
	

}