package com.atul.models;

public class Account {
	private Integer num;
	private String holderName, openingDate;
	private Integer balance;
	
	
	public Account(Integer num, String holderName, String openingDate, Integer balance) {
		super();
		this.num = num;
		this.holderName = holderName;
		this.openingDate = openingDate;
		this.balance = balance;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public String getOpeningDate() {
		return openingDate;
	}
	public void setOpeningDate(String openingDate) {
		this.openingDate = openingDate;
	}
	public Integer getBalance() {
		return balance;
	}
	public void setBalance(Integer balance) {
		this.balance = balance;
	}
	

}
