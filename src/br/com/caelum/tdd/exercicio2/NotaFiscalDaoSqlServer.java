package br.com.caelum.tdd.exercicio2;

public class NotaFiscalDaoSqlServer implements NotaFiscalDao {

	public void persiste(NotaFiscal nf) {
		System.out.println("salva nf no banco");
	}

}
