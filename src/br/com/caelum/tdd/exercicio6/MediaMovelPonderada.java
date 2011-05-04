package br.com.caelum.tdd.exercicio6;

import java.util.List;

public class MediaMovelPonderada{
	
	public double calcula(int posicao, List<Candle> serie, String tipo){
		double soma = 0.0;
		int peso = 1;
		
		for(int i = posicao -2; i <= posicao; i++){
			Candle c = serie.get(i);
			soma += (tipo.equals("abertura")? c.getAbertura() : c.getFechamento())*peso;
			peso++;
		}
		System.out.println(soma);
		return soma/6;
	}
}
