package aula_14;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CalculoIntegral {
//Esse programa é para calcular uma integral

	static double funcao (double x) {
		return x * x + 45 * x / Math.sin(x) + Math.pow(2, x) / (1 - x);
	}

	static double integrar (double inicio, double fim) {
		double retorno = 0;
		double incremento = 0.0001;
				
		for(double i = inicio ; i < fim; i += incremento) {
			retorno += ((incremento) * funcao(((2 * i) + incremento) / 2));
		}
		return retorno;
	}
	
	public static void main(String[] args) {
		
	//Variáveis
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		double inicio = 0;
		double fim = 0;
		
	//Entrada de dados
		try {
			System.out.print("Digite o início: ");
				inicio = Double.parseDouble(leitor.readLine());
			
			System.out.print("Digite o fim: ");
				fim = Double.parseDouble(leitor.readLine());
		} catch (Exception erro) {}
	//Processamento
		System.out.print("Resultado" + integrar(inicio,fim));
	
	}
}
