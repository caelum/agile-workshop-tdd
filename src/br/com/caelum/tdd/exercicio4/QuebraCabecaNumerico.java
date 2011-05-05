package br.com.caelum.tdd.exercicio4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class QuebraCabecaNumerico {

	private int entrada;
	private int saida;
	private List<Numero> fila;
	private Set<Integer> visitados;
	
	public QuebraCabecaNumerico() {
		this.fila = new ArrayList<Numero>();
		this.visitados = new HashSet<Integer>();
	}

	public String geraCaminho(int entrada, int saida) {
		this.entrada = entrada;
		this.saida = saida;
		
		return formataSaida(buscaSolucao());
	}
	
	private Numero buscaSolucao() {
		 
		adicionaRaizNaFila();
		
		while(existemNumerosNaFila()) {
			Numero numeroAtual = removeDaFila();
			
			if(encontrouSaida(numeroAtual)) return numeroAtual;
			adicionaNaFila(
				multiplicaPorDois(numeroAtual),
				(ehPar(numeroAtual)?dividePorDois(numeroAtual):null),
				somaDois(numeroAtual)
			);
		}
		
		return null;
	}

	private boolean ehPar(Numero numeroAtual) {
		return numeroAtual.getValor()%2==0;
	}

	private boolean encontrouSaida(Numero numeroAtual) {
		return numeroAtual.getValor() == saida;
	}

	private boolean existemNumerosNaFila() {
		return fila.size()!=0;
	}

	private void adicionaRaizNaFila() {
		fila.add(new Numero(entrada, null));
	}
	
	private void adicionaNaFila(Numero... numeros) {
		for(Numero numero : numeros) {
			if(numero!=null) {
				if(!visitados.contains(numero.getValor())) {
					fila.add(numero);
					visitados.add(numero.getValor());
				}
			}
		}
	}

	private String formataSaida(Numero solucao) {
		String resposta = "";
			while(solucao!=null) {
				resposta = solucao.getValor() + " " + resposta;
				solucao = solucao.getPai();
			}
		return resposta;
	}
	
	private Numero multiplicaPorDois(Numero numero) {
		return new Numero(numero.getValor()*2, numero);
	}

	private Numero dividePorDois(Numero numero) {
		return new Numero(numero.getValor()/2, numero);
	}
	
	private Numero somaDois(Numero numero) {
		return new Numero(numero.getValor()+2, numero);
	}

	private Numero removeDaFila() {
		Numero topoDaFila = fila.get(0);
		fila.remove(0);
		return topoDaFila;
	}
	

}
