package br.com.caelum.tdd.exercicio1;

import static br.com.caelum.tdd.exercicio1.Position.DBA;
import static br.com.caelum.tdd.exercicio1.Position.DEVELOPER;
import static br.com.caelum.tdd.exercicio1.Position.TESTER;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.caelum.tdd.exercicio1.Employee;
import br.com.caelum.tdd.exercicio1.Position;
import br.com.caelum.tdd.exercicio1.SalaryCalculator;

public class SalaryCalculatorTest {

	private SalaryCalculator calculator;

	@Before
	public void setUp() {
		calculator = new SalaryCalculator();
	}
	
	@Test
	public void deveRetornar4000MenosImpostosDe20PorCentoSeDesenvolvedorGanhaMaisDe3000(){
		Employee desenvolvedor = umFuncionario(DEVELOPER, comSalarioBase(4000.0));
		
		double salary = calculator.calculate(desenvolvedor);
		
		assertEquals(4000.0 * 0.8, salary, 0.000001);
	}

	@Test
	public void deveRetornar1000MenosImpostosDe10PorCentoSeDesenvolvedorGanhaMenosDe3000(){
		Employee desenvolvedor = umFuncionario(DEVELOPER, comSalarioBase(1000.0));
		
		double salario = calculator.calculate(desenvolvedor);
		
		assertEquals(1000.0 * 0.9, salario, 0.000001);
	}


	@Test
	public void deveRetornar4000MenosImpostosDe25PorCentoSeDBAGanhaMaisDe2000(){
		Employee dba = umFuncionario(DBA, comSalarioBase(4000.0));
		
		double salario = calculator.calculate(dba);
		
		assertEquals(4000.0 * 0.75, salario, 0.000001);
	}

	@Test
	public void deveRetornar1000MenosImpostosDe15PorCentoSeDBAGanhaMenosDe2000(){
		Employee dba = umFuncionario(DBA, comSalarioBase(1000.0));
		
		double salario = calculator.calculate(dba);
		
		assertEquals(1000.0 * 0.85, salario, 0.000001);
	}

	@Test
	public void deveRetornar4000MenosImpostosDe25PorCentoSeTestadorGanhaMaisDe2000(){
		Employee testador = umFuncionario(TESTER, comSalarioBase(4000.0));
		
		double salario = calculator.calculate(testador);
		
		assertEquals(4000.0 * 0.75, salario, 0.000001);
	}

	@Test
	public void deveRetornar1000MenosImpostosDe15PorCentoSeTestadorGanhaMenosDe2000(){
		Employee testador = umFuncionario(TESTER, comSalarioBase(1000.0));
		
		double salario = calculator.calculate(testador);
		
		assertEquals(1000.0 * 0.85, salario, 0.000001);
	}
	
		
	private Employee umFuncionario(Position cargo, double salario) {
		Employee funcionario = new Employee();
		funcionario.setName("Martin Fowler");
		funcionario.setBaseSalary(salario);
		funcionario.setPosition(cargo);
		return funcionario;
	}
	

	private double comSalarioBase(double salario) {
		return salario;
	}
}
