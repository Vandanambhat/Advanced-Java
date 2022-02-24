package com.xworkz.injection_spring.passport.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;

import com.xworkz.injection_spring.passport.entity.contants.BloodGroup;
import com.xworkz.injection_spring.passport.entity.contants.Gender;
import com.xworkz.injection_spring.passport.entity.contants.PassportPersonnelType;
import com.xworkz.injection_spring.passport.entity.contants.VerifiedDocument;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PassportEntity implements Serializable {

	
	private int pid;
	private String issuedBy;
	private String expiresAt;
	private String issuedAt;
	private Gender gender;
	private String passportNo;
	private String address;
	private String fullName;
	private boolean legalIssue;
	private PassportPersonnelType passportPersonnelType;
	private LocalDateTime dob;
	private BloodGroup bloodGroup;
	private VerifiedDocument verifiedDocument;

	public PassportEntity(String issuedBy, String expiresAt, String issuedAt, Gender gender, String passportNo,
			String address, String fullName, boolean legalIssue, PassportPersonnelType passportPersonnelType,
			LocalDateTime dob, BloodGroup bloodGroup, VerifiedDocument verifiedDocument) {
		super();
		this.issuedBy = issuedBy;
		this.expiresAt = expiresAt;
		this.issuedAt = issuedAt;
		this.gender = gender;
		this.passportNo = passportNo;
		this.address = address;
		this.fullName = fullName;
		this.legalIssue = legalIssue;
		this.passportPersonnelType = passportPersonnelType;
		this.dob = dob;
		this.bloodGroup = bloodGroup;
		this.verifiedDocument = verifiedDocument;
	}

}
