package com.mercury.timesheet.beans;

import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
public class Holiday {
	private int hid;
	private String hName;
	private Date hDate;
	
	@Id
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment", strategy="increment")
	@Column
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	
	@Column
	public String gethName() {
		return hName;
	}
	public void sethName(String hName) {
		this.hName = hName;
	}
	
	@Column
	public Date gethDate() {
		return hDate;
	}
	public void sethDate(Date hDate) {
		this.hDate = hDate;
	}
	
	
}
