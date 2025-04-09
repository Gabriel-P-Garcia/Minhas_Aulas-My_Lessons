package aula_05; //Esse programa é para calcular o custo total de uma compra com desconto para quantidade minima

import java.util.Scanner;

public class atacado {
	public static void main (String[] args) {
	Scanner leitor = new Scanner(System.in);
	
//Declaração de variáveis
	double preço = 0;
	int quantidade = 0;
	double valorTotal = 0;
	
//Entrada de dados
	System.out.print("Digite o preço: ");
		preço = leitor.nextDouble();
	System.out.print("Digite a quantidade: ");
		quantidade = leitor.nextInt();
	leitor.close();;
	
//Processamento
	valorTotal = (preço * quantidade);
	
	if (quantidade >= 30) {
		valorTotal *= 0.7;
	} else if (quantidade >= 20) {
		valorTotal *= 0.8;
	} else if (quantidade >= 10) {
		valorTotal *= 0.9;
	}
//Saida de dados
	System.out.print("Valor total da compra: " + valorTotal);
	}

}
