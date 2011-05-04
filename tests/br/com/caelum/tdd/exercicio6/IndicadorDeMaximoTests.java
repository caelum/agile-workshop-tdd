package br.com.caelum.tdd.exercicio6;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Calendar;

import org.junit.Test;

public class IndicadorDeMaximoTests {

	@Test
	public void deveRetornarOValorDeMaximo() {
		double valor = new IndicadorDeMaximo().calcula(1, Arrays.asList(
				candleComMaximo(10.0), candleComMaximo(12.0),
				candleComMaximo(11.0)));

		assertEquals(12.0, valor, 0.00001);

	}

	private Candle candleComMaximo(double maximo) {
		return new Candle(0, 0, 0, maximo, Calendar.getInstance());
	}
}
