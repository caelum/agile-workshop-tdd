package br.com.caelum.tdd.exercicio4;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class QuebraCabecaNumericoTests {

	@Test
	public void testaEntrada2ESaida2() {
		assertEquals("2 ", new QuebraCabecaNumerico().geraCaminho(2,2));
	}
	
	@Test
	public void testaEntrada2ESaida4() {
		assertEquals("2 4 ", new QuebraCabecaNumerico().geraCaminho(2,4));
	}
	
	@Test
	public void testaEntrada2ESaida8() {
		assertEquals("2 4 8 ", new QuebraCabecaNumerico().geraCaminho(2,8));
	}
	
	@Test
	public void testaEntrada2ESaida10() {
		assertEquals("2 4 8 10 ", new QuebraCabecaNumerico().geraCaminho(2,10));
	}

	@Test
	public void testaEntrada3ESaida10() {
		assertEquals("3 5 10 ", new QuebraCabecaNumerico().geraCaminho(3,10));
	}

	@Test
	public void testaEntrada2ESaida9() {
		assertEquals("2 4 8 16 18 9 ", new QuebraCabecaNumerico().geraCaminho(2,9));
	}
	
	@Test
	public void testaEntra9ESaida2() {
		assertEquals("9 18 20 10 12 6 8 4 2 ", new QuebraCabecaNumerico().geraCaminho(9,2));
	}
	
	@Test
	public void testaEntra3ESaida11() {
		assertEquals("3 5 7 9 11 ", new QuebraCabecaNumerico().geraCaminho(3,11));
	}
}
