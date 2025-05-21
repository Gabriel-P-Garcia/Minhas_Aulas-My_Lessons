package aula_09;

import java.util.Scanner;
//Esse programa é para calcular a distancia de o tempo de viagem de um lançamento balístico
public class LancamentoBalistico {
public static void main (String[] Args) {
Scanner leitor = new Scanner(System.in);

//Entrada

	double angulo = 0;
	double velocidade = 0;
	double distancia = 0;
	double tempo = 0;
	double gravidade = 9.8;
	
//Entrada de dados
	
	System.out.print("Digite o ângulo de lançamento: ");
		angulo = leitor.nextDouble();
	System.out.print("Digite a velocidade inicial de lançamento: ");
		velocidade = leitor.nextDouble();
		
	leitor.close();
	
//Processamento
	
	angulo = ((Math.PI * angulo) / 180);
	tempo = ((2 * velocidade * Math.sin(angulo)) / gravidade);
	distancia = ((Math.pow(velocidade, 2) * Math.sin(2 * gravidade)) / gravidade);
	
	for (double i = 0 ; i < tempo ; i++) {
		distancia = (velocidade * Math.cos(angulo) * i);
		System.out.println(i + "\t" + distancia);
	}
	 
	distancia = ((Math.pow(velocidade, 2) * Math.sin(2 * angulo)) / gravidade);
	
//Saída de dados
	
	System.out.println("Tempo Final: " + tempo);
	System.out.println("Distância Final: " + distancia);
}

}
