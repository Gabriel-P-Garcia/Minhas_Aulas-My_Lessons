package aula_06;

import java.util.Scanner; //Esse programa é para definir qual tipo de trangulo baseado em ângulo

public class Angulos_Triangulo {
	public static void main (String[] args) {
		Scanner leitor = new Scanner(System.in);

//Declaração de variaveis
		int angulo1 = 0;
		int angulo2 = 0;
		int angulo3 = 0;

//Entrada de dados
		System.out.print("Digite o valor do primeiro ângulo: ");
			angulo1 = leitor.nextInt();
		System.out.print("Digite o valor do segundo ângulo: ");
			angulo2 = leitor.nextInt();
		System.out.print("Digite o valor do terceiro ângulo: ");
			angulo3 = leitor.nextInt();
		
		leitor.close();

//Saida de dados
		if (angulo1 + angulo2 + angulo3 != 180) {
			System.out.println("Isso não é um triângulo");
		} else if ((angulo1 <= 0) || (angulo2 <= 0) || (angulo3 <= 0)) {
			System.out.println("Isso não é um triângulo");
		} else if ((angulo1 == 90) || (angulo2 == 90) || (angulo3 == 90)) {
			System.out.println("Triângulo Retângulo");
		} else if ((angulo1 < 90) && (angulo2 < 90) && (angulo3 < 90)) {
			System.out.println("Triângulo Acutângulo");
		} else {
			System.out.println("Triângulo Obtusângulo");
		}
		
	}

}
