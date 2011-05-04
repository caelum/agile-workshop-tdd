package br.com.caelum.tdd.exercicio5;

public class ContaEstudantil extends ContaComum {

	private int milhas;

	public void deposita(double valor) {
		super.deposita(valor);
		this.milhas += (int)valor;
	}

	public int getMilhas() {
		return milhas;
	}

	
}
