package aula_08;

import java.util.Scanner;

public class PesoMedioPopulacao { //Esse programa é para medir a média de peso de uma população

public static void main (String[] args) {
Scanner leitor = new Scanner(System.in);

//Declaração de variáveis

double peso = 0;
int quantidadePessoas = 0;
double media= 0;

//Entrada de dados
	do {System.out.print("Digite o peso: ");
		peso += leitor.nextDouble();
		quantidadePessoas++;
		System.out.print("Digite <1> se houver mais pessoas: ");
	} while(leitor.nextInt() == 1);
	
	leitor.close();
	
//Processamento
	media = (peso / quantidadePessoas);
	
//Saida de dados
	System.out.print("O peso médio da população é: " + media);
	}

}
