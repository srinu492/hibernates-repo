package com.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "passport_table")
public class Passport {
	@Id
	@Column(name = "passport_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int passportId;
	@Temporal(TemporalType.DATE)
	private Date expireDate;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="persion_id")
	private Persion persion;
	public int getPassportId() {
		return passportId;
	}
	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}
	public Date getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	public Persion getPersion() {
		return persion;
	}
	public void setPersion(Persion persion) {
		this.persion = persion;
	}
	@Override
	public String toString() {
		return "Passport [passportId=" + passportId + ", expireDate=" + expireDate  + "]";
	}
	
}
