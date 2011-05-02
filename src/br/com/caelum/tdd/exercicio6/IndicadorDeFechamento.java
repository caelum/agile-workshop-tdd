package br.com.caelum.tdd.exercicio6;

import java.util.List;

public class IndicadorDeFechamento{
	
	public double calcula(int posicao, List<Candle> serie){
		return serie.get(posicao).getFechamento();
	}
}
