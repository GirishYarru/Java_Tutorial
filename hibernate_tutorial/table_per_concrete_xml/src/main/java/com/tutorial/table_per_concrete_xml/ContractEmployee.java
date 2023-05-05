package com.tutorial.table_per_concrete_xml;

public class ContractEmployee extends Employee{
	private float pay_per_hour;
	private String contract_duration;

	public float getPay_per_hour() {
		return pay_per_hour;
	}

	public void setPay_per_hour(float pay_per_hour) {
		this.pay_per_hour = pay_per_hour;
	}

	public String getContract_duration() {
		return contract_duration;
	}

	public void setContract_duration(String contract_duration) {
		this.contract_duration = contract_duration;
	}

	public ContractEmployee(float pay_per_hour, String contract_duration) {
		super();
		this.pay_per_hour = pay_per_hour;
		this.contract_duration = contract_duration;
	}

	public ContractEmployee() {

	}

}
