package aula_07;

import java.util.Scanner;
//Esse programa é para o usuário colocar um número que precisa ser maior que 10, senão irá repetir
public class LeituraMascarada { 
	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);

//Declaração de variáveis
	int numero = 0;
	
//Entrada de dados
	
	do {
		System.out.print("Digite um número maior que 10: ");
			numero = leitor.nextInt();
		if (numero <= 10) {
			System.out.println("Esse número não é maior que 10");
		}
		} while (numero <= 10);
			leitor.close();
	
//Saída de dados
	System.out.println("Obrigado!");

}
}