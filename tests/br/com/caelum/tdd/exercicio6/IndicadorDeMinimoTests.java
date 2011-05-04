package br.com.caelum.tdd.exercicio6;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Calendar;

import org.junit.Test;

public class IndicadorDeMinimoTests {

	@Test
	public void deveRetornarOValorDeMinimo() {
		double valor = new IndicadorDeMinimo().calcula(1, Arrays.asList(
				candleComMinimo(10.0), candleComMinimo(12.0),
				candleComMinimo(11.0)));

		assertEquals(12.0, valor, 0.00001);

	}

	private Candle candleComMinimo(double minimo) {
		return new Candle(0, 0, minimo, 0, Calendar.getInstance());
	}
}
