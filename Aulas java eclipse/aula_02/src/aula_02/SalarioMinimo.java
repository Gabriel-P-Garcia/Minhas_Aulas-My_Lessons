package aula_02;

import java.util.Scanner;

public class SalarioMinimo {
	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in); //Lembra do ctrl+shift+O
	
	//Declaração de variáveis
	double salario = 0;
	double qtdSalariosMinimos = 0;
	
	//Entrada de dados
	System.out.print("Digite o seu salário: ");
		salario = leitor.nextDouble();
		leitor.close();
		
	//Processamento de dados
		qtdSalariosMinimos = (salario/1518);
		
	//Saida de dados
		System.out.println("A quantidade de salário mínimos é: " + qtdSalariosMinimos);
	}

}
