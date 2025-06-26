package aula_11;

import java.util.Scanner;

public class DecimalParaBinario {
public static void main(String[] args) {
//Esse programa é para transformar um numero decimal em binário
	
//Variaveis
	Scanner leitor = new Scanner(System.in);
	int decimal = 0;
	int[] binario = new int[1000];
	int quantidade = 0;
	
//Entrada de dados
	System.out.print("Digite o número decimal: ");
		decimal = leitor.nextInt();
		
	leitor.close();
	
//Processamento
	do {
		binario[quantidade] = (decimal % 2);
		quantidade++;
		decimal = (decimal / 2);
		} while (decimal > 0);
	
//Saída de dados
	for (int i = (quantidade - 1); i >= 0; i--) {
		System.out.print(binario[i]);
	}
}

}
