package br.com.caelum.tdd.exercicio1;

import static br.com.caelum.tdd.exercicio1.Cargo.DBA;
import static br.com.caelum.tdd.exercicio1.Cargo.DESENVOLVEDOR;
import static br.com.caelum.tdd.exercicio1.Cargo.TESTADOR;

public class CalculadoraDeSalario {


	public double calcula(Funcionario funcionario) {
		if(DESENVOLVEDOR.equals(funcionario.getCargo())) {
			return dezOuVintePorCentoDeDescontoNo(funcionario);
		}
		
		if(DBA.equals(funcionario.getCargo()) || TESTADOR.equals(funcionario.getCargo())) {
			return quinzeOuVinteECincoPorCentoDeDescontoNo(funcionario);
		}
		
		throw new RuntimeException("funcionario invalido");
	}

	private double dezOuVintePorCentoDeDescontoNo(Funcionario funcionario) {
		if(funcionario.getSalarioBase() > 3000.0) {
			return funcionario.getSalarioBase() * 0.8;
		}
		else {
			return funcionario.getSalarioBase() * 0.9;
		}
	}

	private double quinzeOuVinteECincoPorCentoDeDescontoNo(Funcionario funcionario) {
		if(funcionario.getSalarioBase() > 2000.0) {
			return funcionario.getSalarioBase() * 0.75;
		}
		else {
			return funcionario.getSalarioBase() * 0.85;
		}
	}

}
