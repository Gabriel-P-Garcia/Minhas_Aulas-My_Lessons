package aula_08;

import java.util.Scanner;

public class TrianguloAsteriscoInverso {
	//Este programa é para desenhar um triangulo utilizando apenas asteriscos só que de cabeça para baixo
		public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		//Variáveis
			int tamanhoTriangulo = 0;
			
		// Entrada
			System.out.print("Digite o tamanho do triângulo: ");
				tamanhoTriangulo = leitor.nextInt();
			
			leitor.close();
			
			if (tamanhoTriangulo == 0 ) {
				System.out.println("Com 0 não dá né?");
				return;
			}

		//Processamento obs: Para cada dimensão do triangulo você precisa de um novo laço de repetição
			for (int i = 0; i <= tamanhoTriangulo; i++) { //i é linhas e j é colunas
				for (int j = tamanhoTriangulo; j >= i; j--) { //A quantidade de colunas que serão impressas depende do numero da linha
					System.out.print("*");
				}
				System.out.println();
				}
			}
		}


