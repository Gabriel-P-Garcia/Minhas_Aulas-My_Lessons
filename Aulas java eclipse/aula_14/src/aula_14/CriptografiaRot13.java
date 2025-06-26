package aula_14;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Esse programa é para criptografar texto (minusculo) utilizando o metodo Rot13

public class CriptografiaRot13 {
	public static void main(String[] args) {
		//Variaveis
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		String texto = "";
		String criptograma = "";
	
		//Entrada
		try {
			System.out.print("Digite o texto: ");
			texto = leitor.readLine();
		} catch (Exception erro) {}
	
		//Processamento
		criptograma = encriptar(texto);
	
		//Saida de dados
		System.out.println(criptograma);
	
	}

	static String encriptar (String texto) {
		String retorno = "";
		
		for(int i = 0; i < texto.length(); i++) {
			int letraOriginal = texto.charAt(i);
			int letraEncriptada = 0;
				if((letraOriginal < 97) || (letraOriginal >122)) {
					letraEncriptada = letraOriginal;
				} else {
					letraEncriptada = (letraOriginal + 13);
						if(letraEncriptada > 122) {
							letraEncriptada -=26;
						}
				}
			retorno += ((char) letraEncriptada);
		}
		return retorno;
	}
}

