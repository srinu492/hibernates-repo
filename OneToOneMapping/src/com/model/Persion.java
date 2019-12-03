package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "persion_table")
public class Persion {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "persion_id")
	private int persionId;
	@Column(name = "persion_name")
	private String persionName;
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

	@Override
	public String toString() {
		return "Persion [persionId=" + persionId + ", persionName=" + persionName + "]";
	}


}
