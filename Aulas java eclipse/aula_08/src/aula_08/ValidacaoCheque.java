package aula_08;

import java.util.Scanner;

public class ValidacaoCheque { //Esse programa é para validação de lote de cheques
public static void main (String[] args) {
Scanner leitor = new Scanner(System.in);

//Variáveis
double valorLote= 0;
int quantidadeChequesLote = 0;

double somaValorCheques = 0;
int contadorCheques = 0;

//Entrada
	System.out.print("Digite a quantidade de cheques no lote: ");
	quantidadeChequesLote = leitor.nextInt();
	System.out.print("Digite o valor total do lote: ");
	valorLote = leitor.nextDouble();
	
	do {
		System.out.print("Digite o valor do cheque individual: ");
		somaValorCheques += leitor.nextDouble();
		contadorCheques++;
		
		System.out.print("Digite <1> caso houver mais cheques ou <0> para sair: ");
	} while(leitor.nextInt() == 1);
	
	leitor.close();
	
//Saida de dados
	if ((quantidadeChequesLote != contadorCheques) || (valorLote != somaValorCheques)) { 
		System.out.println("Atenção, este lote é inválido");
	} else {
		System.out.println("O lote é válido");
	}
}

}
