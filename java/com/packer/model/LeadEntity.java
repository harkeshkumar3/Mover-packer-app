package com.packer.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LeadEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int leadId;
	private int userId;
	private Date shiftingDate;
	private String shiftingFrom;
	private String shiftTo;
	private String itemList;
	private String shiftingType;
	private int competitionLeft;
	private double leadPrice;
	private Date createdDate;
	private int createdBy;
	private boolean activeYN;
	
	
	public int getLeadId() {
		return leadId;
	}
	public void setLeadId(int leadId) {
		this.leadId = leadId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Date getShiftingDate() {
		return shiftingDate;
	}
	public void setShiftingDate(Date shiftingDate) {
		this.shiftingDate = shiftingDate;
	}
	public String getShiftingFrom() {
		return shiftingFrom;
	}
	public void setShiftingFrom(String shiftingFrom) {
		this.shiftingFrom = shiftingFrom;
	}
	public String getShiftTo() {
		return shiftTo;
	}
	public void setShiftTo(String shiftTo) {
		this.shiftTo = shiftTo;
	}
	public String getItemList() {
		return itemList;
	}
	public void setItemList(String itemList) {
		this.itemList = itemList;
	}
	public String getShiftingType() {
		return shiftingType;
	}
	public void setShiftingType(String shiftingType) {
		this.shiftingType = shiftingType;
	}
	public int getCompetitionLeft() {
		return competitionLeft;
	}
	public void setCompetitionLeft(int competitionLeft) {
		this.competitionLeft = competitionLeft;
	}
	public double getLeadPrice() {
		return leadPrice;
	}
	public void setLeadPrice(double leadPrice) {
		this.leadPrice = leadPrice;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	public boolean isActiveYN() {
		return activeYN;
	}
	public void setActiveYN(boolean activeYN) {
		this.activeYN = activeYN;
	}
	
	

}
