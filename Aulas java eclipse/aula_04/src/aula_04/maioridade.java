package aula_04;

import java.util.Scanner;

public class maioridade {
public static void main (String[] args) {
Scanner leitor = new Scanner (System.in);

// Declaração de variaveis
	int idade = 0;
	
// Entrada de dados
	System.out.print("Insira a sua idade: ");
		idade = leitor.nextInt();
		
	leitor.close();
	
// Saída de dados
	
	if (idade >= 18) {
		System.out.println("Pode dirigir");
		} else {
		System.out.println("Fica em casa e espera");
		}
	}
}
