package com.springboot.entity;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="VoterList")
public class VoterListEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="FullName")
	private String fullName;
	
	@Column(name="VoterNumber")
	private String voterNum;
	
	@Column(name="FatherName")
	private String fatherName;
	
	@Column(name="Address")
	private String address;
	
	@Column(name="Created_AT")
	@CreationTimestamp
	private Date createdAt;
	
	@Column(name="Uptated_At")
	@UpdateTimestamp
	private Date UpdatedAt;
	
	
	public VoterListEntity(int id, String fullName, String voterNum, String fatherName, String address, Date createdAt,
			Date updatedAt) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.voterNum = voterNum;
		this.fatherName = fatherName;
		this.address = address;
		this.createdAt = createdAt;
		UpdatedAt = updatedAt;
	}
	public VoterListEntity() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getVoterNum() {
		return voterNum;
	}
	public void setVoterNum(String voterNum) {
		this.voterNum = voterNum;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return UpdatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		UpdatedAt = updatedAt;
	}
		
	

}
