package br.com.caelum.tdd.exercicio6;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import org.junit.Test;

public class MediaMovelPonderadaDeAberturaTests {

	@Test
	public void deveCalcularMediaMovelPonderadaDeAberturaParaUmaLista() {
		List<Candle> serie = Arrays.asList(candleComAbertura(10.0), candleComAbertura(22.0), candleComAbertura(30.0));
		
		double valor = new MediaMovelPonderadaDeAbertura().calcula(2, serie);
		
		assertEquals(24.0, valor, 0.00001);
	}

	private Candle candleComAbertura(double abertura) {
		return new Candle(abertura, 0, 0, 0, Calendar.getInstance());
	}}
