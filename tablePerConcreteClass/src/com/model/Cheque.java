package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="cheque")
public class Cheque extends Payment{
	private int chequeNumber;
	@Column(length=8)
	private String chequeType;

	public int getChequeNumber() {
		return chequeNumber;
	}

	public void setChequeNumber(int chequeNumber) {
		this.chequeNumber = chequeNumber;
	}

	public String getChequeType() {
		return chequeType;
	}

	public void setChequeType(String chequeType) {
		this.chequeType = chequeType;
	}

}
