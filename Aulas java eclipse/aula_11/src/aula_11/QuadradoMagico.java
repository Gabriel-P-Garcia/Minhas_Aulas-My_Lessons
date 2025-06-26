package aula_11;

import java.util.Scanner;

public class QuadradoMagico {
	//Esse programa é para determinar se uma matriz é um quadrado mágico
public static void main(String[] args) {

//Variaveis
	Scanner leitor = new Scanner(System.in);
	int [][] quadradoMagico = new int [4][4];
	boolean magico = true;
	int numeroMagico = 0;
	int soma = 0;
	
//Entrada de dados
	for (int i = 0; i < quadradoMagico.length; i++) {
		for(int j = 0; j < quadradoMagico.length; j++) {
			System.out.print("Digite a posição [" + i + "] e [" + j + "] = ");
				quadradoMagico[i][j] = leitor.nextInt();
		}
	}
	leitor.close();
	
//Processamento Diagonal principal
	for (int i = 0; i < quadradoMagico.length; i++) {
		numeroMagico += quadradoMagico[i][i];
	}
//Processamento Diagonal invertida
	soma = 0;
	for (int i = 0; i < quadradoMagico.length; i++) {
		soma += quadradoMagico[i][quadradoMagico.length - 1 - i];
	}
	if (numeroMagico != soma) {
		magico = false;
	}
//Processamento linhas
	for(int i = 0; i < quadradoMagico.length; i++) {
		soma = 0;
		for(int j = 0; j < quadradoMagico[i].length; j++) {
			soma += quadradoMagico[i][j]; 
		}
		if (numeroMagico != soma) {
			magico = false;
		}
	}
//Processamento colunas
	for(int i = 0; i < quadradoMagico.length; i++) {
		soma = 0;
		for(int j = 0; j < quadradoMagico[i].length; j++) {
			soma += quadradoMagico[j][i]; 
		}
		if (numeroMagico != soma) {
			magico = false;
	}
}
	
//Saida
	if(magico == true) {
		System.out.println("O quadrado é mágico");
	} else {
		System.out.println("O quadrado não é magico");
	}
}

}
