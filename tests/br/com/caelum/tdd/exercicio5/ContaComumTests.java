package br.com.caelum.tdd.exercicio5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ContaComumTests {

	@Test
	public void deveDepositar() {
		ContaComum account = new ContaComum();
		
		account.deposita(1000.0);
		assertEquals(1000, account.getSaldo(), 0.00001);
		
		account.deposita(500.5);
		assertEquals(1500.5, account.getSaldo(), 0.00001);
	}
	

	public void deveSacarSeValorEhMenorDoQueDisponivel() {
		ContaComum account = new ContaComum();
		account.deposita(1000.0);
		
		account.saca(900);
		
		assertEquals(100.0, account.getSaldo(), 0.00001);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void deveProibirSaqueSeValorEhMaisDoQueDisponivel() {
		ContaComum account = new ContaComum();
		account.deposita(1000.0);
		
		account.saca(2000.0);
	}
	
}
