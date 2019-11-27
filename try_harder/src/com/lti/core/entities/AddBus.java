package com.lti.core.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity(name="AddBus")
@Table(name="ADDBUS")
public class AddBus {
	
	@Id
	@Column(name="BUS_ID")
	private int busId;
	@Column(name="BUS_NAME")
	private String busName;
	@Column(name="VEH_NUM")
	private String vehNum;
	@Column(name="SOURCE")
	private String source;
	@Column(name="DESTINATION")
	private String destination;
	@Column(name="JOURNEY_DATE")
	private java.util.Date date;
	
	
	@Override
	public String toString() {
		return "AddBus [busId=" + busId + ", busName=" + busName + ", vehNum=" + vehNum + ", source=" + source
				+ ", destination=" + destination + ", date=" + date + "]";
	}
	public AddBus() {
		System.out.println("object created");
	}
	public AddBus(int busId, String busName, String vehNum, String source, String destination, Date date) {
		super();
		this.busId = busId;
		this.busName = busName;
		this.vehNum = vehNum;
		this.source = source;
		this.destination = destination;
		this.date = date;
	}
	public int getBusId() {
		return busId;
	}
	public void setBusId(int busId) {
		this.busId = busId;
	}
	public String getBusName() {
		return busName;
	}
	public void setBusName(String busName) {
		this.busName = busName;
	}
	public String getVehNum() {
		return vehNum;
	}
	public void setVehNum(String vehNum) {
		this.vehNum = vehNum;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public java.util.Date getDate() {
		return date;
	}
	public void setDate(java.util.Date date) {
		this.date = date;
	}
	
	
}
