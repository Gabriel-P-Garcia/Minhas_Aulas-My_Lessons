package aula_06;

import java.util.Scanner;

public class OperacoesBancarias {
	public static void main (String[] args) {
	Scanner leitor = new Scanner(System.in);
	
//Variáveis
	double saldoInicial = 0;
	int operacao = 0;
	double valor = 0;
	double saldoFinal = 0;
	
//Entrada de dados
	System.out.print("Digite seu saldo inicial: ");
		saldoInicial = leitor.nextDouble();
	System.out.print("Digite 1 para saque ou 2 para depósito: ");
		operacao = leitor.nextInt();
	System.out.print("Digite o valor: ");
		valor = leitor.nextDouble();
		
	leitor.close();

//Processamento
	if (operacao == 1) {
		saldoFinal = (saldoInicial - valor);
	} else if (operacao == 2) {
		saldoFinal = (saldoInicial + valor);
	} else {
		saldoFinal = saldoInicial;
	}

//Saída de dados
	System.out.println("Saldo final: " + saldoFinal);
	}
}
