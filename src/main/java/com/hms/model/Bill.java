package com.hms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bill {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Bill_id")
	private long id;
	private String particular;
	private int quantity;
	private int unitValue;
	
	public Bill() {
		super();
	}
	
	public Bill(long id, String particular, int quantity, int unitValue) {
		super();
		this.id = id;
		this.particular = particular;
		this.quantity = quantity;
		this.unitValue = unitValue;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getParticular() {
		return particular;
	}
	public void setParticular(String particular) {
		this.particular = particular;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getUnitValue() {
		return unitValue;
	}
	public void setUnitValue(int unitValue) {
		this.unitValue = unitValue;
	}

	@Override
	public String toString() {
		return "Bill [id=" + id + ", particular=" + particular + ", quantity=" + quantity + ", unitValue=" + unitValue
				+ "]";
	}
}
