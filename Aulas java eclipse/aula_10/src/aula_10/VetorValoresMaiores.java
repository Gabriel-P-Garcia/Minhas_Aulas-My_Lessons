package aula_10;

import java.util.Scanner;
//Esse programa é para separar apenas os valores dos vetores maiores que a variavel limite
public class VetorValoresMaiores {
public static void main(String[] args) {
	
//Variáveis
	Scanner leitor = new Scanner(System.in);
	int[] vetorOriginal = new int [10];
	int[] vetorMaior = new int[10];
	
	int limite = 0;
	int quantidade = 0;
	
//Entrada de dados
	for (int i = 0 ; i < vetorOriginal.length ; i++) {
		System.out.print("Digite o valor do índice " + i + ": ");
			vetorOriginal[i] = leitor.nextInt();
	}
		
	System.out.print("Digite o valor limite: ");
		limite = leitor.nextInt();
		
	leitor.close();
	
//Processamento
	for (int i = 0 ; i < vetorOriginal.length ; i++) {
		if (vetorOriginal [i] > limite) {
			vetorMaior[quantidade] = vetorOriginal[i];
			quantidade++;
		}
	}
//Saída de dados
	for(int i = 0; i < quantidade; i++) {
		System.out.println("vetorMaior[" + i + "] = " + vetorMaior[i]);
	}
}
}


