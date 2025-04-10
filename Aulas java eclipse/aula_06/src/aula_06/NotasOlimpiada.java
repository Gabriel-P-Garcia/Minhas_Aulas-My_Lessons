package aula_06;

import java.util.Scanner; 
/*Esse programa é para calcular a média das notas de um atleta 
nas olimpiadas, onde a nota mais alta e a nota mais baixa são descartadas*/

public class NotasOlimpiada {
	public static void main (String[] args) {
	Scanner leitor = new Scanner (System.in);

//Variáveis
	double nota1 = 0;
	double nota2 = 0;
	double nota3 = 0;
	double nota4 = 0;
	double nota5 = 0;
	double nota6 = 0;
	double media = 0;
	
//Entrada de dados
	System.out.print("Digite a nota 1: ");
		nota1 = leitor.nextDouble();
	System.out.print("Digite a nota 2: ");
		nota2 = leitor.nextDouble();
	System.out.print("Digite a nota 3: ");
		nota3 = leitor.nextDouble();
	System.out.print("Digite a nota 4: ");
		nota4 = leitor.nextDouble();
	System.out.print("Digite a nota 5: ");
		nota5 = leitor.nextDouble();
	System.out.print("Digite a nota 6: ");
		nota6 = leitor.nextDouble();
		
	leitor.close();

//Processamento
	double maior = Math.max(nota1, Math.max(nota2, Math.max(nota3, Math.max(nota4, Math.max(nota5, nota6)))));
	double menor = Math.min(nota1, Math.min(nota2, Math.min(nota3, Math.min(nota4, Math.min(nota5, nota6)))));
	media = ((nota1 + nota2 + nota3 + nota4 + nota5 + nota6 - maior - menor) / 4);
	
//Saida de dados
	System.out.println("A média é: " + media);
	}
}
