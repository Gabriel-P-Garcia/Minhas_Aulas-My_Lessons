package aula_02;

import java.util.Scanner;
//Esse programa é para calcular a quantidade de segundos presentes em uma passagem de tempo específica
public class QuantidadeSegundos {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		//Declaração de variáveis
		int Horas = 0;
		int Minutos = 0;
		int Segundos = 0;
		int qtdTotalSegundos = 0;
		
		//Entrada de dados
		System.out.print("Digite quantas horas: ");
			Horas = leitor.nextInt();
		System.out.print("Digite quantos minutos: ");
			Minutos = leitor.nextInt();
		System.out.print("Digite quandos segundos: ");
			Segundos = leitor.nextInt();
			leitor.close();
			
		//Processamento de dados (tambem da para fazer qtdTotalSegundos = ((Segundos) + (60 * Minutos) + (3600 * Horas))
			Horas = Horas * 60 * 60;
			Minutos = Minutos * 60;
			qtdTotalSegundos = Horas + Minutos + Segundos;
			
		//Saida de dados
		System.out.println("O número de segundos é: " + qtdTotalSegundos);
	}
}
