package aula_05;

import java.util.Scanner;

public class areaPoligono {
	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	
//Variáveis
	int lados = 0;
	double aresta = 0;
	double perimetro = 0;
	double area = 0;
	
//Entrada de dados
	System.out.print("Digite a quantidade de lados do polígono: ");
		lados = leitor.nextInt();
		
	System.out.print("Digite o tamanho da aresta: ");
		aresta = leitor.nextDouble();
	
	leitor.close();
	
//Processamento
	perimetro = (lados * aresta);
	switch (lados) {
		case 3:
			area = ((Math.pow(aresta, 2) * Math.sqrt(3)) /4);
			break;
		case 4:
			area = (Math.pow(aresta, 2));
			break;
		case 5:
			area = ((perimetro * (aresta / 1.45)) / 2); //Envia isso pro professor por email
			break;
		case 6: 
			area = ((3 * Math.pow(aresta, 2) * Math.sqrt(3)) / 2);
			break;
		case 7:
			area = ((7 / 4) * Math.pow(aresta, 2) * (1 / Math.tan(51.4285714)));
			break;
		}
// Saida de dados
	System.out.println("Perímetro: " + perimetro);
	System.out.println("Área: " + area);
	}
}
