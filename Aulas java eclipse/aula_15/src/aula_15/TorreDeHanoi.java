package aula_15;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TorreDeHanoi {
	
//Esse programa é para resolver a torre de Hanoi utilizando função recursiva
	public static void main(String[] args) {
		//Variaveis
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		int qtdDiscos = 0;
		
		//Entrada
		try { 
			System.out.print("Digite a quantidade de discos: ");
			qtdDiscos = Integer.parseInt(leitor.readLine());
		} catch (Exception erro) {}
		
		//Processamento
		mover(qtdDiscos, "Origem", "Trabalho", "Destino");
	}

	//Função
	static void mover (int qtdDiscos, String origem, String trabalho, String destino) {
		
		//Condição de saída
		if (qtdDiscos == 0) {
			return;
		}
		
		//Invocação recursiva propriamente dita
		mover(qtdDiscos - 1, origem, trabalho, trabalho);
		System.out.println("Movimente " + qtdDiscos + " de " + origem + " para " + destino);
		mover(qtdDiscos - 1, trabalho, origem, destino);
	}
}
