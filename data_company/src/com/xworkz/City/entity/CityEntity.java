package com.xworkz.City.entity;

public class CityEntity {

	private int id;
	private String name;
	private float population;
	private String famousFor;
	private String coronaZone;
	
	public CityEntity() {
		System.out.println("Invoked no-arg constructor");
	}

	public CityEntity(int id, String name, float population, String famousFor, String coronaZone) {
		super();
		this.id = id;
		this.name = name;
		this.population = population;
		this.famousFor = famousFor;
		this.coronaZone = coronaZone;
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

	public float getPopulation() {
		return population;
	}

	public void setPopulation(float population) {
		this.population = population;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}

	public String getCoronaZone() {
		return coronaZone;
	}

	public void setCoronaZone(String coronaZone) {
		this.coronaZone = coronaZone;
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
		CityEntity other = (CityEntity) obj;
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
		return "CityEntity [id=" + id + ", name=" + name + ", population=" + population + ", famousFor=" + famousFor
				+ ", coronaZone=" + coronaZone + "]";
	}
	
}
