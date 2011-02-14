package br.com.caelum.tdd.exercise1;

import static br.com.caelum.tdd.exercise1.Position.DEVELOPER;
import static br.com.caelum.tdd.exercise1.Position.DBA;
import static br.com.caelum.tdd.exercise1.Position.TESTER;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTests {

	private SalaryCalculator calculator;

	@Before
	public void setUp() {
		calculator = new SalaryCalculator();
	}
	
	@Test
	public void shouldReturn4000MinusTaxesOf20PercentIfDeveloperEarnsMoreThan3000(){
		Employee developer = aEmployee(DEVELOPER, withBaseSalary(4000.0));
		
		double salary = calculator.calculate(developer);
		
		assertEquals(4000.0 * 0.8, salary, 0.000001);
	}

	@Test
	public void shouldReturn1000MinusTaxesOf10PercentIfDeveloperEarnsLessThan3000(){
		Employee developer = aEmployee(DEVELOPER, withBaseSalary(1000.0));
		
		double salary = calculator.calculate(developer);
		
		assertEquals(1000.0 * 0.9, salary, 0.000001);
	}


	@Test
	public void shouldReturn4000MinusTaxesOf25PercentIfDBAEarnsMoreThan2000(){
		Employee developer = aEmployee(DBA, withBaseSalary(4000.0));
		
		double salary = calculator.calculate(developer);
		
		assertEquals(4000.0 * 0.75, salary, 0.000001);
	}

	@Test
	public void shouldReturn1000MinusTaxesOf15PercentIfDBAEarnsLessThan2000(){
		Employee developer = aEmployee(DBA, withBaseSalary(1000.0));
		
		double salary = calculator.calculate(developer);
		
		assertEquals(1000.0 * 0.85, salary, 0.000001);
	}

	@Test
	public void shouldReturn4000MinusTaxesOf25PercentIfTesterEarnsMoreThan2000(){
		Employee developer = aEmployee(TESTER, withBaseSalary(4000.0));
		
		double salary = calculator.calculate(developer);
		
		assertEquals(4000.0 * 0.75, salary, 0.000001);
	}

	@Test
	public void shouldReturn1000MinusTaxesOf15PercentIfTesterEarnsLessThan2000(){
		Employee developer = aEmployee(TESTER, withBaseSalary(1000.0));
		
		double salary = calculator.calculate(developer);
		
		assertEquals(1000.0 * 0.85, salary, 0.000001);
	}
	
		
	private Employee aEmployee(Position position, double salary) {
		Employee developer = new Employee();
		developer.setName("john doe");
		developer.setBaseSalary(salary);
		developer.setPosition(position);
		return developer;
	}
	

	private double withBaseSalary(double d) {
		return d;
	}
}
