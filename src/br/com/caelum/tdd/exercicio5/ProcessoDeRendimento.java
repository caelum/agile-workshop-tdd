package br.com.caelum.tdd.exercicio5;

import java.util.Arrays;
import java.util.List;

public class ProcessoDeRendimento {

	public static void main(String[] args) {

		for(ContaComum c : contas()) {
			c.rende();

			System.out.println("Novo saldo:");
			System.out.println(c.getSaldo());
		}
	}

	private static List<ContaComum> contas() {
		return Arrays.asList(contaCom(100), contaCom(150), contaDeEstudanteCom(200));
	}

	private static ContaComum contaDeEstudanteCom(double valor) {
		ContaEstudantil c = new ContaEstudantil();
		c.deposita(valor);
		return c;
	}

	private static ContaComum contaCom(double valor) {
		ContaComum c = new ContaComum();
		c.deposita(valor);
		return c;
	}

}
