package aula_07;

import java.util.Scanner;

public class Exponencial {
	//Esse programa é para calcular um exponencial
	
public static void main(String[] args) {
Scanner leitor = new Scanner(System.in);

//Declaração de variáveis
	double base = 0;
	double expoente = 0;
	double resultado = 1;
	
//Entrada de dados
	System.out.print("Digite a base: ");
		base = leitor.nextDouble();
	System.out.print("Digite o expoente: ");
		expoente = leitor.nextDouble();
	
	leitor.close();
		
//Processamento
	for (int i = 0 ; i < expoente ; i++) {
			resultado *= base;
	}

//Saida de dados
	System.out.println(base + " ^ " + expoente + " = " + resultado);
}
}
