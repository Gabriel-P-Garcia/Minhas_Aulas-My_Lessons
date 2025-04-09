package aula_05; //Esse programa é para definir tipos de triangulo por aresta

import java.util.Scanner;

public class Triangulo {
	public static void main (String[] args) {
	Scanner leitor = new Scanner(System.in);
	
//Variaveis
	int aresta1 = 0;
	int aresta2 = 0;
	int aresta3 = 0;
	
//Entrada de dados
	System.out.print("Qual o valor da primeira aresta: ");
		aresta1 = leitor.nextInt();
	System.out.print("Qual o valor da segunda aresta: ");
		aresta2 = leitor.nextInt();
	System.out.print("Qual o valor da terceira aresta: ");
		aresta3 = leitor.nextInt();
	leitor.close();
	
//Saida de dados
	if ((aresta1 == aresta2) && (aresta2 == aresta3)) {
		System.out.println("Triângulo equilátero");
	} else if ((aresta1 == aresta2) || (aresta2 == aresta3) || (aresta1 == aresta3)){
		System.out.println("Triângulo isóceles");
	} else {
		System.out.println("Triângulo escaleno");
	}
	}

}
