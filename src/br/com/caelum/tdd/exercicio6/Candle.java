package br.com.caelum.tdd.exercicio6;

import java.util.Calendar;

public class Candle {

	private double abertura;
	private double fechamento;
	private double minimo;
	private double maximo;
	private Calendar data;
	
	public Candle(double abertura, double fechamento, double minimo,
			double maximo, Calendar data) {
		this.abertura = abertura;
		this.fechamento = fechamento;
		this.minimo = minimo;
		this.maximo = maximo;
		this.data = data;
	}
	
	public double getAbertura() {
		return abertura;
	}
	public double getFechamento() {
		return fechamento;
	}
	public double getMinimo() {
		return minimo;
	}
	public double getMaximo() {
		return maximo;
	}
	public Calendar getData() {
		return data;
	}
	
	
	
}
