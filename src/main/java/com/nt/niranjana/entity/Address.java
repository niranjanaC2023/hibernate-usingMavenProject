package com.nt.niranjana.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;

@Entity
@Table(name="hbn_student_address")
public class Address 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="address_id")
	private int addressId;
	
	@Column(length = 50,name="STREET")
	private String street;
	
	@Column(length = 20,name="CITY")
	private String city;
	
	@Column(name="CITY_ISOPEN")
	private boolean cityIsOpen;
	
	@Transient
	private double accountBalance;
	
	@Column(name="DATE OF BIRTH")
	@Temporal(TemporalType.DATE)  //ONLY DATE, NOT TIME
	private Date dob;
	
	@Lob
	private byte[] image;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Address(int addressId, String street, String city, boolean cityIsOpen, double accountBalance, Date dob,
			byte[] image) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
		this.cityIsOpen = cityIsOpen;
		this.accountBalance = accountBalance;
		this.dob = dob;
		this.image = image;
	}

	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public boolean isCityIsOpen() {
		return cityIsOpen;
	}
	public void setCityIsOpen(boolean cityIsOpen) {
		this.cityIsOpen = cityIsOpen;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	
	

}
