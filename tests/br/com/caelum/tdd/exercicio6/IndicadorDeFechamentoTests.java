package br.com.caelum.tdd.exercicio6;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Calendar;

import org.junit.Test;

public class IndicadorDeFechamentoTests {

	@Test
	public void deveRetornarOValorDeFechamento() {
		double valor = new IndicadorDeFechamento().calcula(1, Arrays.asList(candleComFechamento(10.0), candleComFechamento(12.0), candleComFechamento(11.0)));
		
		assertEquals(12.0, valor, 0.00001);
		
		
	}

	private Candle candleComFechamento(double fechamento) {
		return new Candle(0, fechamento, 0, 0, Calendar.getInstance());
	}
}
