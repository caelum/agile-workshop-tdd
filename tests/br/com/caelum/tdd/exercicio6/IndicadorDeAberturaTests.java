package br.com.caelum.tdd.exercicio6;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Calendar;

import org.junit.Test;

public class IndicadorDeAberturaTests {

	@Test
	public void deveRetornarOValorDeAbertura() {
		double valor = new IndicadorDeAbertura().calcula(1, Arrays.asList(
				candleComAbertura(10.0), candleComAbertura(12.0),
				candleComAbertura(11.0)));

		assertEquals(12.0, valor, 0.00001);

	}

	private Candle candleComAbertura(double abertura) {
		return new Candle(abertura, 0, 0, 0, Calendar.getInstance());
	}
}
