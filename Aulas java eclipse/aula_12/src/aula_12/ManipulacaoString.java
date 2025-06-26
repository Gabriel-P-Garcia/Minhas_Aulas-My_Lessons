package aula_12;

import java.util.Scanner;

public class ManipulacaoString {
public static void main(String[] args) { //Esse programa é para manipular strings
	
//Variaveis
	Scanner leitor = new Scanner(System.in);
	String texto = "";
	String remocao = "";
	String procura = "";
	int contadorOcorrencias = 0;
	int posicao = 0;
	
//Entrada de dados
	System.out.print("Digite um texto: ");
		texto = leitor.nextLine();
	
	System.out.print("Digite o que é para remover: ");
		remocao = leitor.nextLine();
		
	System.out.print("Digite o que é para procurar: ");
		procura = leitor.nextLine();
		
	leitor.close();
	
//Processamento - Saída de dados
	System.out.println("Primeira letra: " + texto.substring(0,1));
	System.out.println("Última letra: " + texto.substring(texto.length() - 1));
	System.out.println("Tamanho: " + texto.length());
	System.out.println("Tudo maiúsculo: " + texto.toUpperCase());
	System.out.println("Tudo minúsculo: " + texto.toLowerCase());
	System.out.println("Removido: " + texto.replaceAll(remocao, ""));
	
	do {
		posicao = texto.indexOf(procura,posicao);
		if (posicao > -1) {
			contadorOcorrencias++;
			posicao++;
		}
	} while (posicao > 0);
	
	System.out.println("Quantidade de ocorrências: " + contadorOcorrencias);
}

}
