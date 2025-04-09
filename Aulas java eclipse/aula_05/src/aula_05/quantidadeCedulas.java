package aula_05; //Esse estudo pe oara calcular a quantidade de cédulas para aprovisionar um valor

import java.util.Scanner;

public class quantidadeCedulas {
	public static void main (String[] args) {
	Scanner leitor = new Scanner(System.in);

//Variaveis
	int valor = 0;
	int qtd200 = 0;
	int qtd100 = 0;
	int qtd50 = 0;
	int qtd20 = 0;
	int qtd10 = 0;
	int qtd5 = 0;
	int qtd2 = 0;
	int qtd1 = 1;
	
//Entrada de dados
	System.out.print("Digite o valor do saque: ");
		valor = leitor.nextInt();
		
	leitor.close();

//Processamento
	qtd200 = (valor / 200);
		valor = (valor % 200);
		
	qtd100 = (valor / 200);
		valor  = (valor % 100);
		
	qtd50 = (valor / 50);
		valor = (valor % 50);
		
	qtd20 = (valor / 20);
		valor = (valor % 20);
		
	qtd10 = (valor / 10);
		valor = (valor % 10);
		
	qtd5 = (valor / 5);
		valor = (valor % 5);
		
	qtd2 = (valor / 2);
		valor = (valor % 2);
		
	qtd1 = (valor / 1);
		valor = (valor % 1);

//Saida de dados
	if (qtd200 > 0) {
		System.out.println(qtd200 + " notas de 200");
	}
	if (qtd100 > 0) {
		System.out.println(qtd100 + " notas de 100");
	}
	if (qtd50 > 0) {
		System.out.println(qtd50 + " notas de 50");
	}
	if (qtd20 > 0) {
		System.out.println(qtd20 + " notas de 20");
	}
	if (qtd10 > 0) {
		System.out.println(qtd10 + " notas de 10");
	}
	if (qtd5 > 0) {
		System.out.println(qtd5 + " notas de 5");
	}
	if (qtd2 > 0) {
		System.out.println(qtd2 + " notas de 2");
	}
	if (qtd1 > 0) {
		System.out.println(qtd1 + " notas de 1");
	}
	}
}
