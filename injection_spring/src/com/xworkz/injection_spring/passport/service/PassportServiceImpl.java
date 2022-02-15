package com.xworkz.injection_spring.passport.service;

import com.xworkz.injection_spring.passport.daoORrepository.PassportRepositaryImpl;
import com.xworkz.injection_spring.passport.daoORrepository.PassportRepository;
import com.xworkz.injection_spring.passport.entity.PassportEntity;

public class PassportServiceImpl implements PassportService {

	PassportRepository passportServiceRepository=new PassportRepositaryImpl();

	public PassportServiceImpl() {
		System.out
				.println(passportServiceRepository.getClass().getSimpleName().concat(" no-arg constructor is invoked"));
	}

	@Override
	public boolean validateAndSave(PassportEntity entity) {

		boolean valid = false;

		// IssuedBy
		if (entity.getIssuedBy().length() >= 3 && entity.getIssuedBy().length() <= 135) {
			System.out.println(entity.getIssuedBy());
			valid = true;
		} else {

			System.out.println(entity.getIssuedAt().concat(" is not a valid issuedBy"));
			return false;
		}

		// IssuedAt
//		if(entity.getIssuedAt()!=null && entity.getIssuedAt()) {
//		valid=true;
//			System.out.println(entity.getIssuedAt());
//		}
//		else {
//			System.out.println(entity.getIssuedAt().concat(" is not a valid issued date"));
//		return false;
//		}

		// ExpiresAt
//		if(entity.getExpiresAt()!=null) {
//			if(entity.getExpiresAt())
//		}

		// Gender
		if (entity.getGender() != null) {
			valid = true;
			System.out.println(entity.getGender());
		} else {
			System.out.println("given Gender does not exists, please enter the correct gender");
			return false;
		}

		// PassportNo
		if (entity.getPassportNo() != null) {

		}

		// Address
		if (entity.getAddress() != null && entity.getAddress().length() >= 20 && entity.getAddress().length() <= 200) {
			System.out.println(entity.getAddress().concat(" Given address is valid"));
		} else {
			System.out.println("Given addresss is in Valid");
			System.out.println(entity.getAddress().length());
			return false;
		}

		// FullName
		if (entity.getFullName() != null && entity.getFullName().length() >= 10
				&& entity.getFullName().length() <= 200) {

			System.out.println(entity.getFullName().concat(" is valid Full Name"));
		} else {
			System.out.println("Entered Full Name is not valid");
			System.out.println(entity.getFullName());
			return false;
		}

		// legalIssue
		if (entity.isLegalIssue() != false) {
			valid = true;
			System.out.println(" Legal Issue found, passport blocked");
		} else {
			System.out.println(entity.isLegalIssue());
			System.out.println("No legal issues found, person can travel");
			return false;
		}

		// passportpersonnelType
		if (entity.getPassportPersonnelType() != null) {
			valid = true;
			System.out.println(entity.getPassportPersonnelType());
		} else {
			System.out.println(" passposrt personnel Type is not valid");
		}

		// DOB
		if (entity.getDob() != null) {
			valid = true;
			System.out.println(entity.getDob());
		} else {
			System.out.println("Invalid DOB");
			return false;
		}

		// Blood Group
		if (entity.getBloodGroup() != null) {
			valid = true;
			System.out.println(entity.getBloodGroup());
		} else {
			System.out.println("Invalid Blood group");
			return false;
		}

		// verifiedDocument
		if (entity.getVerifiedDocument() != null) {
			valid = true;
			System.out.println(entity.getVerifiedDocument());
		} else {
			System.out.println("Invalid document submitted, please submit again to re-verify");
			return false;
		}
		return false;
	}

}
