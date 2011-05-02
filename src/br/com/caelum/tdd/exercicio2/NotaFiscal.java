package br.com.caelum.tdd.exercicio2;


public class NotaFiscal {

	private int id;
	private double valorBruto;
	private double impostos;

	public NotaFiscal(int id, double valorBruto, double impostos) {
		this.id = id;
		this.valorBruto = valorBruto;
		this.impostos = impostos;
	}

	public NotaFiscal(double valorBruto, double impostos) {
		this(0, valorBruto, impostos);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getValorBruto() {
		return valorBruto;
	}
	public void setValorBruto(double valorBruto) {
		this.valorBruto = valorBruto;
	}
	public double getImpostos() {
		return impostos;
	}
	public void setImpostos(double impostos) {
		this.impostos = impostos;
	}
	
	public double getValorLiquido() {
		return this.valorBruto - this.impostos;
	}

}
