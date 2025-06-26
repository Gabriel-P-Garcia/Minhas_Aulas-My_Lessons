package aula_13;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MascaraInteiros { 
/*Esse programa é uma versão mais profissional da mascara de números inteiros, fracionarios 
 * e de texto com um tamanho definido*/
	
//Declaração de funções
	static int lerNumeroInteiro() {
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		int retorno = 0;
		boolean continuar = false;
		
		do {
			try {
				System.out.print("Digite um número inteiro: ");
				retorno = Integer.parseInt(leitor.readLine());
				continuar = false;
			} catch (Exception erro) {
				System.out.println("Erro, você não digitou um número inteiro.");
				continuar = true;
			}
		} while(continuar);
		
		return retorno;
	}
	
	static double lerNumeroFracionado() {
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		double retornoFr = 0;
		boolean continuar = false;
		
		do {
			try {
				System.out.print("Digite um número fracionário: ");
				retornoFr = Double.parseDouble(leitor.readLine());
				continuar = false;
			} catch (Exception erro) {
				System.out.println("Erro, você não digitou um número fracionário.");
				continuar = true;
			}
		} while(continuar);
		
		return retornoFr;
	}
	
	static String lerTextoFixo(int tamanho) {
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		String retorno = "";
		
		do {
			try {
				System.out.print("Digite um texto de tamanho " + tamanho + ": ");
				retorno = leitor.readLine();
			} catch (Exception erro) {}
		} while (retorno.length() != tamanho);
		
		return retorno;
		}
	
	
//Metodo principal de execução da classe
	public static void main(String[] args) {

//Variáveis
	int numero = 0;
	double numeroFr = 0;
	String texto = "";
	
//Entrada de dados
	numero = lerNumeroInteiro();
	numeroFr = lerNumeroFracionado();
	texto = lerTextoFixo(5);
	
//Saída de dados
	System.out.println(numero);
	System.out.println(numeroFr);
	System.out.println(texto);
	}

}
