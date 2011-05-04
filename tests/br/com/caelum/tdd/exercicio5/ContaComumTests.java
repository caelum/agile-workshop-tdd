package br.com.caelum.tdd.exercicio5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ContaComumTests {

	@Test
	public void deveDepositarValorNaConta() {
		ContaComum conta = new ContaComum();
		
		conta.deposita(1000.0);
		assertEquals(1000, conta.getSaldo(), 0.00001);
		
		conta.deposita(500.5);
		assertEquals(1500.5, conta.getSaldo(), 0.00001);
	}
	

	public void deveSacarSeOValorForInferiorAoSaldoDisponivel() {
		ContaComum conta = new ContaComum();
		conta.deposita(1000.0);
		
		conta.saca(900);
		
		assertEquals(100.0, conta.getSaldo(), 0.00001);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void deveProibirSaqueSeForSuperiorAoSaldoDisponivel() {
		ContaComum conta = new ContaComum();
		conta.deposita(1000.0);
		
		conta.saca(2000.0);
	}
	
}
