package com.xworkz.tour.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tour_info")

public class TourEntity implements Serializable {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "location")
	private String location;
	@Column(name = "sea_level")
	private float sealevel;
	@Column(name = "famous_for")
	private String famousFor;
	@Column(name = "entry_fees")
	private double entryFees;
	@Column(name = "season")
	private String season;

	public TourEntity() {
		System.out.println("Invoked no-arg TourEntity");
	}

	public TourEntity(int id, String location, float sealevel, String famousFor, double entryFees, String season) {
		super();
		System.out.println("Invoked parameterized TourEntity");
		this.id = id;
		this.location = location;
		this.sealevel = sealevel;
		this.famousFor = famousFor;
		this.entryFees = entryFees;
		this.season = season;
	}

	public int gettId() {
		return id;
	}

	public void settId(int id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public float getSealevel() {
		return sealevel;
	}

	public void setSealevel(float sealevel) {
		this.sealevel = sealevel;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}

	public double getEntryFees() {
		return entryFees;
	}

	public void setEntryFees(double entryFees) {
		this.entryFees = entryFees;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	@Override
	public String toString() {
		return "TourEntity [id=" + id + ", location=" + location + ", sealevel=" + sealevel + ", famousFor=" + famousFor
				+ ", entryFees=" + entryFees + ", season=" + season + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(entryFees);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((famousFor == null) ? 0 : famousFor.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + Float.floatToIntBits(sealevel);
		result = prime * result + ((season == null) ? 0 : season.hashCode());
		result = prime * result + id;
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
		TourEntity other = (TourEntity) obj;
		if (Double.doubleToLongBits(entryFees) != Double.doubleToLongBits(other.entryFees))
			return false;
		if (famousFor == null) {
			if (other.famousFor != null)
				return false;
		} else if (!famousFor.equals(other.famousFor))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (Float.floatToIntBits(sealevel) != Float.floatToIntBits(other.sealevel))
			return false;
		if (season == null) {
			if (other.season != null)
				return false;
		} else if (!season.equals(other.season))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
}
