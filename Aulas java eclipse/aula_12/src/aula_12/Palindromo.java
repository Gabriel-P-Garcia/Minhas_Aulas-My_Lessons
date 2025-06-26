package aula_12;

import java.util.Scanner;

public class Palindromo {
public static void main(String[] args) { //Esse programa é para determinar se um texto é um palindromo ou não

//Variáveis
	Scanner leitor = new Scanner (System.in);
	String texto = "";
	boolean palindromo = true;
	
//Entrada de dados
	System.out.print("Digite um texto: ");
		texto = leitor.nextLine();
		
	leitor.close();
	
//Processamento 
	texto = texto.toLowerCase();
	texto = texto.replaceAll(" ", "");
	texto = texto.replaceAll("-", "");
	texto = texto.replaceAll(",", "");
	for (int i = 0; i< (texto.length() / 2) ; i++) {
		if(texto.charAt(i) != texto.charAt(texto.length() - 1 - i)) {
			palindromo = false;
		}
	}
//Saída de dados
	if(palindromo) {
		System.out.println("É um palíndromo");
	} else {
		System.out.println("NÃO é um palíndromo.");
	}
}

}
