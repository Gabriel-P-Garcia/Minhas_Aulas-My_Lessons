package aula_04;

import java.util.Scanner;

public class ParidadeSinal {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

// Declaração de variaveis
		int num = 0;

// Entrada de dados
		System.out.print("Digite um número inteiro: ");
		num = leitor.nextInt();

		leitor.close();

// Saída de dados
		if (num == 0) {
			System.out.println("Zero");
		} else {
			if (num % 2 == 0) {
				System.out.println("Par");
			} else {
				System.out.println("Ímpar");
			}
			if (num > 0) {
				System.out.println("Positivo");
			} else {
				System.out.println("Negativo");
			}
		}
	}
}
