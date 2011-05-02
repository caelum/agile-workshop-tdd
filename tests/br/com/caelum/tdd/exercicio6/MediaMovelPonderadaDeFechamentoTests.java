package br.com.caelum.tdd.exercicio6;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import org.junit.Test;

public class MediaMovelPonderadaDeFechamentoTests {

	@Test
	public void deveCalcularMediaMovelPonderadaDeAberturaParaUmaLista() {
		List<Candle> serie = Arrays.asList(candleComFechamento(10.0),
				candleComFechamento(22.0), candleComFechamento(30.0));

		double valor = new MediaMovelPonderadaDeFechamento().calcula(2, serie);

		assertEquals(24.0, valor, 0.00001);
	}

	private Candle candleComFechamento(double fechamento) {
		return new Candle(0, fechamento, 0, 0, Calendar.getInstance());
	}
}
