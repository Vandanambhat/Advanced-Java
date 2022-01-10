package com.xworkz.company.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "company_details")
public class CompanyEntity implements Serializable{
	@Id
	@Column(name = "c_id")
	private int c_id;
	@Column(name = "c_name")
	private String c_name;
	@Column(name = "c_type")
	private String c_type;
	@Column(name = "c_domain")
	private String c_domain;
	@Column(name = "c_website")
	private String c_website;

	public CompanyEntity() {
		System.out.println("Invoked no-arg Constructor");
	}

	public CompanyEntity(int c_id, String c_name, String c_type, String c_domain, String c_website) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.c_type = c_type;
		this.c_domain = c_domain;
		this.c_website = c_website;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String getC_type() {
		return c_type;
	}

	public void setC_type(String c_type) {
		this.c_type = c_type;
	}

	public String getC_domain() {
		return c_domain;
	}

	public void setC_domain(String c_domain) {
		this.c_domain = c_domain;
	}

	public String getC_website() {
		return c_website;
	}

	public void setC_website(String c_website) {
		this.c_website = c_website;
	}

	@Override
	public String toString() {
		return "CompanyEntity [c_id=" + c_id + ", c_name=" + c_name + ", c_type=" + c_type + ", c_domain=" + c_domain
				+ ", c_website=" + c_website + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + c_id;
		result = prime * result + ((c_name == null) ? 0 : c_name.hashCode());
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
		CompanyEntity other = (CompanyEntity) obj;
		if (c_id != other.c_id)
			return false;
		if (c_name == null) {
			if (other.c_name != null)
				return false;
		} else if (!c_name.equals(other.c_name))
			return false;
		return true;
	}

}
