package aula_10;

import java.util.Scanner; //Esse programa é para entender arrays/vetores

public class PreenchimentoVetor {
public static void main (String[] args) {
Scanner leitor = new Scanner (System.in);

//Variáveis
	int [] vetor = new int[10];
	
//Entrada
	for(int i = 0; i < vetor.length ; i++) {
		System.out.print("Digite o valor da posição " + i + " do vetor: ");
			vetor[i] = leitor.nextInt();
	}
	
	leitor.close();
	
//Saida de dados
	for (int i = 0; i < vetor.length; i++) {
		System.out.println("Vetor [" + i +"] = " + vetor[i]);
	}
	
	}

}
