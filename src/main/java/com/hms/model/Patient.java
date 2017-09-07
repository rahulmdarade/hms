package com.hms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="patient_id")
	private long id;
	private String name;
	private String address;
	private String gender;
	private String disease;
	private String emailId;
	private long contactNumber;
	
	@OneToOne
	@JoinColumn(foreignKey=@ForeignKey(name="Doctor_id"))
	private Doctor doctor;
	
	public Patient() {
		super();
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", address=" + address + ", gender=" + gender + ", disease="
				+ disease + ", emailId=" + emailId + ", contactNumber=" + contactNumber + ", doctor=" + doctor.getId()
				+ "]";
	}	
}
