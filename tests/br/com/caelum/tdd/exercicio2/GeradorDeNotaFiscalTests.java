package br.com.caelum.tdd.exercicio2;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class GeradorDeNotaFiscalTests {

	private static final double PRECISAO = 0.00001;
	private EnviadorDeEmail email;
	private NotaFiscalDao dao;
	private GeradorDeNotaFiscal gerador;

	@Before
	public void setUp() {
		email = mock(EnviadorDeEmail.class);
		dao = mock(NotaFiscalDao.class);

		gerador = new GeradorDeNotaFiscal(email, dao);
	}
	
	@Test
	public void deveGerarNotaCom6PorCentoDeImposto() {
		Fatura fatura = new Fatura(1000, "cliente 1");
		
		NotaFiscal nf = gerador.gera(fatura);
		
		assertEquals(1000 * 0.06, nf.getImpostos(), PRECISAO);
	}
	
	@Test
	public void deveEnviarEmailComANotaFiscal() {

		Fatura fatura = new Fatura(1000, "cliente 1");
		
		NotaFiscal nf = gerador.gera(fatura);
		
		verify(email).enviaEmail(nf);
	}
	
	@Test
	public void devePersistirANotaFiscalGerada() {
		Fatura fatura = new Fatura(1000, "cliente 1");
		
		NotaFiscal nf = gerador.gera(fatura);
		
		verify(dao).persiste(nf);
	}
}
