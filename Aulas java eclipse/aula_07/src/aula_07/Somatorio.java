package aula_07;

import java.util.Scanner;

//Esse programa é para calcular o somatório 
public class Somatorio {
	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	
//Declaração de variaveis
	double indice = 0;
	double somatorio = 0;
	
//Entrada de dados
	System.out.print("Digite o índice de x² + 3x + 3: ");
		indice = leitor.nextDouble();
	
	leitor.close();
	
	for (double x = 1; x <= indice ; x++) {
		somatorio += (Math.pow(x, 2) + 3 * x + 3);
	}

//Saída de dados
	System.out.println("O somatório: " + somatorio);
	}

}
