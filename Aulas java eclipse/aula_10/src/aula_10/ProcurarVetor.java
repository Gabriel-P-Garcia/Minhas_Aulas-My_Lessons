package aula_10;

import java.util.Scanner;
//Esse programa é para procurar o valor do vetor/array
public class ProcurarVetor {
public static void main (String[] args) {

//Variaveis
	Scanner leitor = new Scanner(System.in);
	int[] vetor = new int[10];
	int valor = 0;
	int indice = 0;
	
//Entrada de dados
	for (int i = 0; i < vetor.length; i++) {
		System.out.print("Digite o valor do índice " + i + " dor vetor: ");
			vetor[i] = leitor.nextInt();
	}
	
	System.out.print("Digite uma valor a ser pesquisado: ");
		valor = leitor.nextInt();
	
	leitor.close();
	
//Processamento
	indice = -1;
	for (int i = 0 ; i < vetor.length ; i++) {
		if(vetor[i] == valor) {
			indice = i;
			break;
		}
	}
	
	if (indice == -1) {
		System.out.println("Não foi possível encontrar o valor");
	} else { 
		System.out.println("O valor está na posição: " + indice);
	}
}

}
