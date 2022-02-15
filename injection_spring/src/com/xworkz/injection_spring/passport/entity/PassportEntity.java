package com.xworkz.injection_spring.passport.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

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
public class PassportEntity implements Serializable{

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
	
}
