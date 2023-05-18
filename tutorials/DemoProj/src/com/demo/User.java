package com.demo;

public class User {

	private String referenceNumber;
	private String customerNumber;
	private String mobileNumber;
	private String email;
	private String status;
	public String getUserReferenceNumber() {
		return referenceNumber;
	}
	public void setUserReferenceNumber(String userReferenceNumber) {
		this.referenceNumber = userReferenceNumber;
	}
	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getVKYCDate() {
		return VKYCDate;
	}
	public void setVKYCDate(String vKYCDate) {
		VKYCDate = vKYCDate;
	}
	public String getCIF() {
		return CIF;
	}
	public void setCIF(String cIF) {
		CIF = cIF;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	private String VKYCDate;

	private String CIF;
	private String account;

}
