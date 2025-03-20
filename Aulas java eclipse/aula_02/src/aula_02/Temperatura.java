package aula_02;

import java.util.Scanner;

public class Temperatura {
	public static void main(String[] args) {
	Scanner leitor = new Scanner (System.in);
	
	//Declaração de variáveis
	double tempCelsius = 0;
	double tempFarenheit = 0;
	
	//Entrada de dados
	System.out.print("Digite a temperatura em celsius: ");
		tempCelsius = leitor.nextDouble();
		leitor.close();
		
	//Processamento de dados
		tempFarenheit = (((9 * tempCelsius) / 5) + 32);
		
		
	//Saida de dados
		System.out.println("A temperatura em Farenheit é: " + tempFarenheit);
	}
	
}
