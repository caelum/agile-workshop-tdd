package br.com.caelum.tdd.exercise1;

import java.util.Calendar;

public class Employee {

	private int id;
	private String name;
	private Position position;
	private Calendar dateOfAdmission;
	private double baseSalary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public Calendar getDateOfAdmission() {
		return dateOfAdmission;
	}
	public void setDateOfAdmission(Calendar dateOfAdmission) {
		this.dateOfAdmission = dateOfAdmission;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	
}
