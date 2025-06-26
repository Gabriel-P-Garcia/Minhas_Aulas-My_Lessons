package aula_15;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FatorialRecursivo { 
	
//Esse programa é para calcular um fatorial utilizando uma função recursiva
	
	static double calcularFatorial(double numero) {
		//Condição de saida
		if(numero < 1) {
			return 1;
		}

		//Invocação recursiva propriamente dita
		return (numero * calcularFatorial(numero - 1));
	}
	
	public static void main(String[] args) {
		//Variaveis
		BufferedReader leitor = new BufferedReader (new InputStreamReader(System.in));
		double numero = 0;
		double fatorial = 0;
		
		//Entrada
		try {
			System.out.println("Digite um número: ");
			numero = Double.parseDouble(leitor.readLine());
		} catch (Exception erro) {}
		
		//Processamento
		fatorial = calcularFatorial(numero);
		
		//Saida de dados
		System.out.println(numero + "! = " + fatorial);
	
}
}
