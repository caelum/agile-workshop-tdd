package br.com.caelum.tdd.exercicio2;

public class EnviadorDeEmailPorSmtp implements EnviadorDeEmail {

	public void enviaEmail(NotaFiscal nf) {
		System.out.println("envia email da nf " + nf.getId());
	}

}
