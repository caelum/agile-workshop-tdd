package br.com.caelum.tdd.exercicio1;

import java.util.Calendar;

public class Employee {

	private int id;
	private String name;
	private Position position;
	private Calendar admissionDate;
	private double baseSalary;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String nome) {
		this.name = nome;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position cargo) {
		this.position = cargo;
	}
	public Calendar getAdmissionDate() {
		return admissionDate;
	}
	public void setAdmissionDate(Calendar dataDeAdmissao) {
		this.admissionDate = dataDeAdmissao;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double salarioBase) {
		this.baseSalary = salarioBase;
	}
	
	
	
	
}
