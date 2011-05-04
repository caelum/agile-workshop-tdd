package br.com.caelum.tdd.exercicio6;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import org.junit.Test;

public class MediaMovelPonderadaTests {

	@Test
	public void deveCalcularMediaMovelPonderadaDeAberturaParaUmaLista() {
		List<Candle> serie = Arrays.asList(candleComAbertura(10.0),
				candleComAbertura(22.0), candleComAbertura(30.0));

		double valor = new MediaMovelPonderada().calcula(2, serie, "abertura");

		assertEquals(24.0, valor, 0.00001);
	}
	

	@Test
	public void deveCalcularMediaMovelPonderadaDeFechamentoParaUmaLista() {
		List<Candle> serie = Arrays.asList(candleComFechamento(10.0),
				candleComFechamento(22.0), candleComFechamento(30.0));

		double valor = new MediaMovelPonderada().calcula(2, serie, "fechamento");

		assertEquals(24.0, valor, 0.00001);
	}


	private Candle candleComAbertura(double abertura) {
		return new Candle(abertura, 0, 0, 0, Calendar.getInstance());
	}
	
	private Candle candleComFechamento(double fechamento) {
		return new Candle(0, fechamento, 0, 0, Calendar.getInstance());
	}
}
