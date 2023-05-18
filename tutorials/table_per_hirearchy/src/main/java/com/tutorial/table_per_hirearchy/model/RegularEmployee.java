package com.tutorial.table_per_hirearchy.model;

public class RegularEmployee extends Employee {

	private float salary;
	private int bonus;

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public RegularEmployee(float salary, int bonus) {
		super();
		this.salary = salary;
		this.bonus = bonus;
	}

	public RegularEmployee() {

	}

}
