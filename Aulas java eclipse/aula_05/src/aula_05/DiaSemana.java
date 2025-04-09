package aula_05; //Esse programa determina o dia da semana a partir da informação de uma data

import java.util.Scanner;

public class DiaSemana {
	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);

//Variáveis
	int dia = 0;
	int mes = 0;
	int ano = 0;
	int diaSemana = 0;
	
//Entrada de dados
	System.out.print("Digite o dia: ");
		dia = leitor.nextInt();
	System.out.print("Digite o mês: ");
		mes = leitor.nextInt();
	System.out.print("Digite o ano: ");
		ano = leitor.nextInt();
		
	leitor.close();
//Processamento
	diaSemana = ((((dia)+(2 * mes) +((3 * (mes + 1)) / 5) + ((ano) + (ano / 4)) - (ano / 100) + (ano / 400) + 2) % 7));
	
//Saida de dados
	if (diaSemana == 1) {
		System.out.print("Domingo");
	} else if (diaSemana == 2) {
		System.out.print("Segunda-Feira");
	} else if (diaSemana == 3) {
		System.out.print("Terça-Feira");
	} else if (diaSemana == 4) {
		System.out.print("Quarta-Feira");
	} else if (diaSemana == 5) {
		System.out.print("Quinta-Feira");
	} else if (diaSemana == 6) {
		System.out.print("Sexta-Feira");
	} else if (diaSemana == 0) {
		System.out.print("Sábado");
	}
	
	}
}
