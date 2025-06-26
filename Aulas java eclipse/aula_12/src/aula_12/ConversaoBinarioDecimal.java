package aula_12;

import java.util.Scanner;

public class ConversaoBinarioDecimal { 
//O proposito desse programa é fazer a conversão de binário para decimal
public static void main(String[] args) {

//Variáveis
	Scanner leitor = new Scanner(System.in);
	String binario = "";
	int decimal = 0;
	
//Entrada de dados
	System.out.print("Digite um número binário: ");
		binario = leitor.next();
		
	leitor.close();
	
//Processamento
	for(int i = 0; i < binario.length(); i++) {
		decimal += (Integer.parseInt(binario.substring(i, i + 1)) * Math.pow(2, binario.length() - 1 - i)); //o parseInt converte o substring para numero
	}
	
//Saida de dados
	System.out.println("Decimal: " + decimal);
}

}
