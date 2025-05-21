package aula_10;

import java.util.Scanner; //Esse programa é para inverter os valores dos vetores

public class InversaoVetor {
public static void main (String [] args) {

//Variáveis
	Scanner leitor = new Scanner(System.in);
	int [] vetorOriginal = new int[5];
	int [] vetorInvertido = new int[5];
	
//Entrada
	for (int i = 0; i < vetorOriginal.length; i++) {
		System.out.print("Digite o valor do índice " + i + " dor vetor: ");
			vetorOriginal[i] = leitor.nextInt();
	}
	
	leitor.close();
	
//Processamento
	for(int i = (vetorOriginal.length - 1); i >= 0; i--) {
		vetorInvertido[vetorOriginal.length - 1 - i] = vetorOriginal[i];
		}
	
//Saida de dados
	for (int i = 0; i < vetorInvertido.length ; i++) {
		System.out.println("vetorInvertido[" + i + "] = " + vetorInvertido [i]);
		}
	}

}
