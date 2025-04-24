package aula_07;

import java.util.Scanner;

public class MediaTurma {
//Esse programa é para calcular a média aritimetica das notas de uma turma
	
public static void main(String[] args) {
Scanner leitor = new Scanner(System.in);

//Variáveis
	double nota = 0;
	double soma = 0;
	double quantidade = 0;
	double media = 0;
	
//Entrada de dados
	do {
		System.out.print("Digite a nota da prova: ");
			nota = leitor.nextDouble();
		soma += nota;
		quantidade++;
		
		System.out.print("Digite <1> se houver mais alunos e <0> se não houver: ");
	} while (leitor.nextInt() == 1);
	
	leitor.close();
	
//Processamento
	media = (soma / quantidade);
	
//Saida de dados
	System.out.println("Media da turma: " + media);
}
}
