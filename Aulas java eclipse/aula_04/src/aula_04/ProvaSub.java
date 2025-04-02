package aula_04;

import java.util.Scanner;

public class ProvaSub {
public static void main (String[] args) {
	Scanner leitor = new Scanner(System.in);
	
// Declaração de variaveis
	double notaP1 = 0;
	double notaP2 = 0;
	double notaP3 = 0;
	double notaPSub = 0;
	double media = 0;
	
// Entrada de dados
	System.out.print("Digite a nota da prova 1: ");
		notaP1 = leitor.nextDouble();
	System.out.print("Digite a nota da prova 2: ");
		notaP2 = leitor.nextDouble();
	System.out.print("Digite a nota da prova 3: ");
		notaP3 = leitor.nextDouble();

// Processamento
	media = ((notaP1 + notaP2 + notaP3)/3);
	
// Saída de dados
	
	if (media >= 5) {
		System.out.println("Aprovado");
					}
	else {
		System.out.print("Digite a nota da prova substitutiva: ");
			notaPSub = leitor.nextDouble();
			if (notaPSub >= 5) {
				System.out.println("Aprovado");
							   }
			else {
				System.out.println("Reprovado, até ano que vem :)");
				 }
				leitor.close();
		 }
			
	}
}
