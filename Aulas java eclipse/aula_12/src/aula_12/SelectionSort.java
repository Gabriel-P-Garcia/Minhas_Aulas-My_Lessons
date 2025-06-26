package aula_12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SelectionSort { //Esse programa é para fazer um algoritmo de ordenamento usando selection sort
public static void main(String[] args) {

//Variáveis
	
	BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
	String[] vetor = new String[10];

//Entrada de dados
	
	try{
		for (int i = 0; i < vetor.length; i++) {
	
		System.out.print("Digite o texto do índice " + i + ": ");
			vetor[i] = leitor.readLine();
		}
	} catch (Exception erro) {
		System.out.println(erro);
	}
	
//Processamento - o "for" externo é para o primeiro ao penúltimo - o "for" interno é para o próximo ao último
	
	for (int i = 0 ; i < (vetor.length - 1) ; i++) {
		for (int j = (i + 1) ; j < vetor.length; j++) {
			if (vetor[i].compareTo(vetor[j]) > 0){
				String temp = vetor[i];
				vetor [i] = vetor [j];
				vetor [j] = temp;
			}
		}
	}
	
//Saída de dados
	for (int i = 0 ; i < vetor.length ; i++) {
		System.out.println(vetor[i]);
	}
}

}
