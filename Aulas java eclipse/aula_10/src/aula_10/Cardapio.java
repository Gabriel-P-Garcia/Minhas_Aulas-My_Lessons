package aula_10;

import java.util.Scanner;

public class Cardapio {
public static void main(String[] args) {
	
//Declaração
	Scanner leitor = new Scanner(System.in);
	
	double[] tabela = new double[100];
	int codigo = 0;
	double valor = 0;
	
//Entrada de dados
	do {
		System.out.print("Digite o código: ");
			codigo = leitor.nextInt();
		System.out.print("Digite o valor: ");
			valor = leitor.nextDouble();
		
		tabela[codigo] = valor;
		
		System.out.print("Digite <1> se houve mais produtos: ");
	} while (leitor.nextInt() == 1);
	
	leitor.close();
	
//Saída de dados
	System.out.println("Codigo\tValor");
	for(int i = 0 ; i < tabela.length ; i++) {
		if(tabela[i] > 0) {
			System.out.println(i + "\t" + tabela[i]);
		}
	}
}

}
