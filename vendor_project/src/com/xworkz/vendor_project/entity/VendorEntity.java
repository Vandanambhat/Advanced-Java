package com.xworkz.vendor_project.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "vendor_details")
@NamedQueries({
		@NamedQuery(name = "findLogin", query = "select vendor from VendorEntity as vendor where vendor.loginName=:ln and vendor.password=:pwd"),
		@NamedQuery(name = "findByEmail", query = "select vendor from VendorEntity as vendor where vendor.email=:em"),
		@NamedQuery(name = "updatePasswordByEmail", query = "update VendorEntity set password=:pw where email=:mail")
})
public class VendorEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "v_id") // 1
	private int id;
	@Column(name = "v_name") // 2
	private String name;
	@Column(name = "v_email")
	private String email;
	@Column(name = "v_loginName") // 3
	private String loginName;
	@Column(name = "v_password") // 4
	private String password;
	@Column(name = "v_address") // 5
	private String address;
	@Column(name = "v_gstNo") // 6
	private String gstNo;
	@Column(name = "v_createdBy") // 7
	private String createdBy;
	@Column(name = "v_createdAt") // 8
	private LocalDateTime createdAt;
	@Column(name = "v_updatedBy") // 9
	private String updatedBy;
	@Column(name = "v_updatedAt") // 10
	private LocalDateTime updatedAt;

	public VendorEntity(String name, String email, String loginName, String password, String address, String gstNo,
			String createdBy, LocalDateTime createdAt, String updatedBy, LocalDateTime updatedAt) {
		super();
		this.name = name;
		this.email = email;
		this.loginName = loginName;
		this.password = password;
		this.address = address;
		this.gstNo = gstNo;
		this.createdBy = createdBy;
		this.createdAt = createdAt;
		this.updatedBy = updatedBy;
		this.updatedAt = updatedAt;
	}

}
