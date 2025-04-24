package aula_07;

import java.util.Scanner;

public class Fatorial {
//Esse programa é para calcular fatorial
	
public static void main (String[] args) {
Scanner leitor = new Scanner(System.in);

//Declaração de variáveis
	double numero = 0;
	double fatorial = 1;
	
//Entrada de dados
	System.out.print("Digite o número para ser calculado em fatorial: ");
		numero = leitor.nextDouble();
	
	leitor.close();
	
//Processamento
	for (double x = numero ; x > 0 ; x--) {
		fatorial *= x;
	}
//Saida de dados
	System.out.println("O fatorial é: " + fatorial);
}

}
