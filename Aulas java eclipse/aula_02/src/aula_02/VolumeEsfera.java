package aula_02;

import java.util.Scanner;

public class VolumeEsfera {
	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	
	//Declaração de variaveis
		double raio = 0;
		double volume = 0;
	
	//Entrada de dados
		System.out.print("Digite o raio da esfera: ");
			raio = leitor.nextDouble();
			leitor.close();
			
	//Processamento de dados
			volume = ((4 * Math.PI * Math.pow(raio, 3)) / 3);
			
	//Saida de dados
		System.out.println("O volume da esfera é: " + volume);
			
	}

}
