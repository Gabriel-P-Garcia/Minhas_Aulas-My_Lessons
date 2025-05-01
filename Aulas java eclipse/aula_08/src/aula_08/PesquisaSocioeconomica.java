package aula_08;

import java.util.Scanner;

public class PesquisaSocioeconomica { //Esse programa é para calcular a porcentagem de quantos individuos pertencem a cada classe social baseado em renda familiar
public static void main (String[] args) {
Scanner leitor = new Scanner(System.in);

//Variáveis
	double rendaFamiliar = 0;
	double tamanhoFamilia = 0;
	
	double classeA = 0;
	double classeB = 0;
	double classeC = 0;
	double classeD = 0;
	double classeE = 0;
	
	double tamanhoPopulacao = 0;
	double classeSocial = 0;
	double continuar = 0;

//Entrada de dados
	do {
		System.out.print("Informe a renda familiar: ");
			rendaFamiliar = leitor.nextDouble();
		System.out.print("Informe o tamanho da familia: ");
			tamanhoFamilia = leitor.nextDouble();
		
	classeSocial = (rendaFamiliar / tamanhoFamilia);
	tamanhoPopulacao += tamanhoFamilia;
	
		if(classeSocial > 10000) {
			classeA += tamanhoFamilia;
		} else if (classeSocial > 5000) {
			classeB += tamanhoFamilia;
		} else if (classeSocial > 2000) {
			classeC += tamanhoFamilia;
		} else if (classeSocial > 1000) {
			classeD += tamanhoFamilia;
		} else if (classeSocial <= 1000) {
			classeE += tamanhoFamilia;
		}	
		
			do {
			System.out.print("Digite <1> para registar a próxima família ou <0> para encerrar o programa: ");
				continuar = leitor.nextDouble();
			} while (continuar != 0 && continuar != 1);
		
	} while (continuar == 1);
	
	leitor.close();
//Saida de dados
	System.out.println("Classe A: " + ((100 * classeA) / tamanhoPopulacao));
	System.out.println("Classe B: " + ((100 * classeB) / tamanhoPopulacao));
	System.out.println("Classe C: " + ((100 * classeC) / tamanhoPopulacao));
	System.out.println("Classe D: " + ((100 * classeD) / tamanhoPopulacao));
	System.out.println("Classe E: " + ((100 * classeE) / tamanhoPopulacao));
	}

}
