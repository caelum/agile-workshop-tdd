package br.com.caelum.tdd.exercicio6;

import java.util.List;

public class MediaMovelPonderadaDeAbertura{
	
	public double calcula(int posicao, List<Candle> serie){
		double soma = 0.0;
		int peso = 1;
		
		for(int i = posicao -2; i <= posicao; i++){
			Candle c = serie.get(i);
			soma += c.getAbertura()*peso;
			peso++;
		}
		System.out.println(soma);
		return soma/6;
	}
}
