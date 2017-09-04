package com.hms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Invoice {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private long patientId;
	private long doctorId;
	private long billId;
	private int totalAmount;
	
	public Invoice() {
		super();
	}

	public Invoice(long id, long patientId, long doctorId, long billId, int totalAmount) {
		super();
		this.id = id;
		this.patientId = patientId;
		this.doctorId = doctorId;
		this.billId = billId;
		this.totalAmount = totalAmount;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getPatientId() {
		return patientId;
	}

	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}

	public long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}

	public long getBillId() {
		return billId;
	}

	public void setBillId(long billId) {
		this.billId = billId;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "Invoice [id=" + id + ", patientId=" + patientId + ", doctorId=" + doctorId + ", billId=" + billId
				+ ", totalAmount=" + totalAmount + "]";
	}
	
}