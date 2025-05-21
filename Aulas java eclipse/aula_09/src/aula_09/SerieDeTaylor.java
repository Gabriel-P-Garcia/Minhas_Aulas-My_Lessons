package aula_09;

import java.util.Scanner;
//Esse programa é apra calculo exponencial pelo metodo de taylor
public class SerieDeTaylor {
public static void main (String[] args) {
Scanner leitor = new Scanner (System.in);

//Variáveis
	
	double expoente = 0;
	double potencia = 1;
	double fatorial = 1;
	double resultado = 0;
	
//Entrada de dados
	
	System.out.print("Digite o expoente: ");
		expoente = leitor.nextDouble();
		
	leitor.close();
	
//Processamento
	
	for (int i = 0 ; i < 100 ; i++ ) {
		for (int j = 0 ; j < i ; j++){
			potencia *= expoente;
		}
		for (double j = i ; j > 0 ; j--) {
			fatorial *= j;
		}
		resultado += (potencia / fatorial);
			potencia = 1;
			fatorial = 1;	
	}

//Saida de dados
	System.out.println("e^" + expoente + " pelo Java: " + Math.pow(Math.E, expoente));
	System.out.println("e^" + expoente + " por Taylor: " + resultado);
}

}
