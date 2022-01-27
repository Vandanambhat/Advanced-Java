package com.xworkz.travel.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "travel_details")
public class TravelEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;// 1
	@Column(name = "t_emailId")
	private String emailId;// 2
	@Column(name = "t_password")
	private String password;// 3
	@Column(name = "t_age")
	private int age;// 4
	@Column(name = "t_mobileNo")
	private long mobileNo;// 5
	@Column(name = "t_place")
	private String place;// 6
	@Column(name = "t_country")
	private String country;// 7
	@Column(name = "t_cost")
	private float cost;// 8
	@Column(name = "t_dateOfTravel")
	private LocalDateTime dateOfTravel;// 9
	@Column(name = "t_daysOfTravel")
	private int daysOfTravel;// 10
	@Column(name = "t_travellingType")
	private String travellingType;// 11
	@Column(name = "t_noOfBranches")
	private int noOfBranches;// 12
	@Column(name = "t_noOfTravellers")
	private int noOfTravellers;// 13
	@Column(name = "t_createdBy")
	private String createdBy;//14
	@Column(name = "t_createdAt")
	private LocalDateTime createdAt;//15

	public TravelEntity(String emailId, String password, int age, long mobileNo, String place, String country,
			float cost, LocalDateTime dateOfTravel, int daysOfTravel, String travellingType, int noOfBranches,
			int noOfTravellers, String createdBy, LocalDateTime createdAt) {
		super();
		this.emailId = emailId;
		this.password = password;
		this.age = age;
		this.mobileNo = mobileNo;
		this.place = place;
		this.country = country;
		this.cost = cost;
		this.dateOfTravel = dateOfTravel;
		this.daysOfTravel = daysOfTravel;
		this.travellingType = travellingType;
		this.noOfBranches = noOfBranches;
		this.noOfTravellers = noOfTravellers;
		this.createdBy = createdBy;
		this.createdAt = createdAt;
	}

}
