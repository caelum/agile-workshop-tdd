package br.com.caelum.tdd.exercise1;

import static br.com.caelum.tdd.exercise1.Position.DBA;
import static br.com.caelum.tdd.exercise1.Position.DEVELOPER;
import static br.com.caelum.tdd.exercise1.Position.TESTER;

public class SalaryCalculator {


	public double calculate(Employee employee) {
		if(DEVELOPER.equals(employee.getPosition())) {
			return tenOrTwentyPercentDiscount(employee);
		}
		
		if(DBA.equals(employee.getPosition())) {
			return fifteenOrTwentyFivePercentDiscount(employee);
		}
		
		if(TESTER.equals(employee.getPosition())) {
			return fifteenOrTwentyFivePercentDiscount(employee);
		}
		
		throw new RuntimeException("invalid employee");
	}

	private double tenOrTwentyPercentDiscount(Employee employee) {
		if(employee.getBaseSalary() > 3000.0) {
			return employee.getBaseSalary() * 0.8;
		}
		else {
			return employee.getBaseSalary() * 0.9;
		}
	}

	private double fifteenOrTwentyFivePercentDiscount(Employee employee) {
		if(employee.getBaseSalary() > 2000.0) {
			return employee.getBaseSalary() * 0.75;
		}
		else {
			return employee.getBaseSalary() * 0.85;
		}
	}

}
