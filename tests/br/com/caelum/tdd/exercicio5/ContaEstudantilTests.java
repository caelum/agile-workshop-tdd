package br.com.caelum.tdd.exercicio5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ContaEstudantilTests {

	@Test
	public void deveGanharMilhasPorCadaRealDepositado() {
		ContaEstudantil conta = new ContaEstudantil();
		assertEquals(0, conta.getMilhas(), 0.00001);
		
		conta.deposita(150);
		
		assertEquals(150, conta.getMilhas());
	}
}
