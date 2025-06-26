package aula_13;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MascaraTelefone {
//Esse programa é para fazer uma mascara que confere um número de telefone
	
	static boolean validarTelefone (String telefone) {
		//Verificação da quantidade de caracteres
		
		if(telefone.length() !=17) {
			return false;
		}
		
		//Verificação do inicio com +
		if(telefone.charAt(0) !='+') {
			return false;
		}
		
		//Verificação do DDI
		try {
			Integer.parseInt(telefone.substring(1, 3));
		} catch (Exception erro) {
			return false;
		}
		
		//Verificação da abertura do parentese
		if(telefone.charAt(3) != '(') {
			return false;
		}
		
		//Verificação do DDD
		try {
			Integer.parseInt(telefone.substring(4,6));
		} catch (Exception erro) {
			return false;
		}
		
		//Verificação do fechamento do parentese
		if(telefone.charAt(6) != ')') {
			return false;
		}
		
		//Verificação do prefixo
		try {
			Integer.parseInt(telefone.substring(7, 12));
		} catch (Exception erro) {
			return false;
		}
		
		//Verificação do fechamento do hifen
		if(telefone.charAt(12) != '-') {
			return false;
		}
		
		//Verificação do sufixo
		try {
			Integer.parseInt(telefone.substring(13));
		} catch (Exception erro) {
			return false;
		}
				
		
	return true;
	}
	
	static String lerTelefone() {
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		String retorno = "";
		
		try {
			System.out.print("Digite o telefone: ");
			retorno = leitor.readLine();
		} catch (Exception erro) {}
		return retorno;
	}
	
//Metodo principal de execução da classe	
public static void main(String[] args) {
	String telefone = lerTelefone();
	boolean tudoCerto = validarTelefone(telefone);
	
	if (tudoCerto) { 
		System.out.println("É um número válido");
	} else {
		System.out.println("O número não é válido");
	}
}

}
