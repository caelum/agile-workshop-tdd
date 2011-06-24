package br.com.caelum.tdd.exercicio4;

public class Numero {
	private final int valor;
	private final Numero pai;
	
	public Numero(int valor, Numero pai) {
		this.valor = valor;
		this.pai = pai;
	}
	public int getValor() {
		return valor;
	}

	public Numero getPai() {
		return pai;
	}
}
