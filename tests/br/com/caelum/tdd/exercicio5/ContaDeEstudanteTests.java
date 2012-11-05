package br.com.caelum.tdd.exercicio5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ContaDeEstudanteTests {

	@Test
	public void deveGanharMilhasParaCadaRealDepositado() {
		ContaDeEstudante account = new ContaDeEstudante();
		assertEquals(0, account.getMilhas(), 0.00001);
		
		account.deposita(150);
		
		assertEquals(150, account.getMilhas());
	}
}
