package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "persion")
public class Persion {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "persion_id")
	private int persionId;
	@Column(name = "name", length = 20, nullable = false)
	private String persionName;
	@Column(name = "password", nullable = false)
	private String password;
	@Version
	private int version;

	public int getPersionId() {
		return persionId;
	}

	public void setPersionId(int persionId) {
		this.persionId = persionId;
	}

	public String getPersionName() {
		return persionName;
	}

	public void setPersionName(String persionName) {
		this.persionName = persionName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
