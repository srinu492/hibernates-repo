package com.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class Address {
	@Column(length = 50)
	private String street;
	@Column(length = 50)
	private String city;
	@Column(length = 50)
	private String state;
	private Long pincod;

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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Long getPincod() {
		return pincod;
	}

	public void setPincod(Long pincod) {
		this.pincod = pincod;
	}

}
