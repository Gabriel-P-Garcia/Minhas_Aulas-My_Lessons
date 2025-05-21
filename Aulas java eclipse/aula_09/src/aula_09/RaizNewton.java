package aula_09;

import java.util.Scanner;

//Esse programa é para calcular raiz quadrada utilizando o metodo de Newton (Sem usar Math.sqrt)
public class RaizNewton {
public static void main (String[] args) {
Scanner leitor = new Scanner(System.in);

//Variáveis
	double numero = 0;
	double estimativa = 0;

//Entrada de dados
	
	System.out.print("Digite um número para calcular a raiz quadrada: ");
		numero = leitor.nextDouble();
		
	leitor.close();
	
//Processamento
	
	estimativa = (numero / 2);
	
	for (int i = 0 ; i < 100 ; i++) {
		System.out.println(estimativa);
		estimativa = (((estimativa) + (numero / estimativa)) / 2);
	}
		
//Saída de dados
	
	System.out.println("Raiz quadrada pelo Java: " + Math.sqrt(numero));
	System.out.println("Raiz quadrada por Newton: " + estimativa);
	
}
}
