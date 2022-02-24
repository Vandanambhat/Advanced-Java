package com.xworkz.injection_spring.passport;


import java.time.LocalDateTime;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.injection_spring.passport.entity.PassportEntity;
import com.xworkz.injection_spring.passport.entity.contants.BloodGroup;
import com.xworkz.injection_spring.passport.entity.contants.Gender;
import com.xworkz.injection_spring.passport.entity.contants.PassportPersonnelType;
import com.xworkz.injection_spring.passport.entity.contants.VerifiedDocument;

public class PassportDirector {

	public static void main(String[] args) {

		
//		ApplicationContext container=new ClassPathXmlApplicationContext("spring.xml");
		
/*		String issuedBy, String expiresAt, String issuedAt, Gender gender, String passportNo,
		String address, String fullName, boolean legalIssue, PassportPersonnelType passportPersonnelType,
		LocalDateTime dob, BloodGroup bloodGroup, VerifiedDocument verifiedDocument*/
		PassportEntity entity= new PassportEntity(null, null, null, null, null, null, null, false, null, null, null, null);
		
	}

}