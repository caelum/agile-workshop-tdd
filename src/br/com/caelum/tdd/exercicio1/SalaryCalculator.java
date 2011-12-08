package br.com.caelum.tdd.exercicio1;

import static br.com.caelum.tdd.exercicio1.Position.DBA;
import static br.com.caelum.tdd.exercicio1.Position.DEVELOPER;
import static br.com.caelum.tdd.exercicio1.Position.TESTER;

public class SalaryCalculator {


	public double calculate(Employee employee) {
		if(DEVELOPER.equals(employee.getPosition())) {
			return tenOrTwentyPercent(employee);
		}
		
		if(DBA.equals(employee.getPosition()) || TESTER.equals(employee.getPosition())) {
			return fifteenOrTwentyFivePercent(employee);
		}
		
		throw new RuntimeException("invalid employee");
	}

	private double tenOrTwentyPercent(Employee employee) {
		if(employee.getBaseSalary() > 3000.0) {
			return employee.getBaseSalary() * 0.8;
		}
		else {
			return employee.getBaseSalary() * 0.9;
		}
	}

	private double fifteenOrTwentyFivePercent(Employee employee) {
		if(employee.getBaseSalary() > 2000.0) {
			return employee.getBaseSalary() * 0.75;
		}
		else {
			return employee.getBaseSalary() * 0.85;
		}
	}

}
