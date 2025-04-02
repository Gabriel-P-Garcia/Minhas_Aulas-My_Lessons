package aula_04;

import java.util.Scanner;

public class SomaDoisMenores {
	public static void main (String[] args) {
	Scanner leitor = new Scanner(System.in);
	
// Variáveis
	int num1 = 0;
	int num2 = 0;
	int num3 = 0;
	int soma = 0;
	
//Entrada de dados
	
	System.out.print("Digite o primeiro número: ");
		num1 = leitor.nextInt();
	System.out.print("Digite o segundo número: ");
		num2 = leitor.nextInt();
	System.out.print("Digite o terceiro número: ");
		num3 = leitor.nextInt();
	
	leitor.close();
	
// Processamento
	
	
	if ((num2 > num1) && (num2 > num3)) {
		num2 = 0;
										}
	if ((num1 > num2) && (num1 > num3)) {
		num1 = 0;
										}
	if ((num3 > num1) && (num3 > num2)) {
		num3 = 0;
										}
	soma = (num1 + num2 + num3);
	
// Saída de dados
	System.out.println("A soma dos dois menores é: " + soma);
	}
}
