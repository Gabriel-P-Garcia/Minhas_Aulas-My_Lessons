package aula_01;

import java.util.Scanner;

public class Calculadora {
	public static void main (String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		int numero1 = 0;
		int numero2 = 0;
		int resultado = 0;
		int resultado2 = 0;
		int resultado3 = 0;
		int resultado4 = 0;
		
		//Entrada de dados
		System.out.print("Digite o primeiro número: ");
		numero1 = leitor.nextInt();
		
		System.out.print("Digite o segundo número: ");
		numero2 = leitor.nextInt();
		
		leitor.close();
		
		//Processamento (Lembra que o .close é para cortar o input do usuario na maquina)
		resultado = (numero1 + numero2);
		resultado2 = (numero1 - numero2);
		resultado3 = (numero1 * numero2);
		resultado4 = (numero1 / numero2);
		
		//Saida de dados
		System.out.println("O resultado da soma é: " + resultado);
		System.out.println("O resultado da subtração é: " + resultado2);
		System.out.println("O resultado da multiplicação é: " + resultado3);
		System.out.println("O resultado da divisão é: " + resultado4);
		
	}
}
