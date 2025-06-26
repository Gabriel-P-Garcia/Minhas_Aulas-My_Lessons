package aula_13;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class VerificadorCPF { 
//Esse programa é para verificar se o cpf é válido e para calcular os digitos verificadores
	
	static String lerCPF(){
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		String retorno = "";
		
		try {
			System.out.print("Digite o CPF sem dígitos verificadores: ");
			retorno = leitor.readLine();
		} catch (Exception erro) {}
		
		return retorno;
	}
	
	static String calcularDV(String cpf) {
		int dv1 = 0;
		int dv2 = 0;
		
		
		try { 
			// calculo do primeiro DV
			for(int i = 0; i < 9; i++) {
				dv1 += ((10 - i) * Integer.parseInt(cpf.substring(i, i+1)));
			}
			dv1 = (dv1 % 11);
			dv1 = 11 - dv1;
			if (dv1 >= 10) {
				dv1 = 0;
			}
			// calculo do segundo Dv
			cpf += dv1;
			for(int i = 0; i < 10; i++) {
				dv2 += ((11 - i) * Integer.parseInt(cpf.substring(i, i + 1)));
			}
			dv2 = (dv2 % 11);
			dv2 = 11 - dv2;
			if (dv2 >= 10) {
				dv2 = 0;
			}
			return "-" + dv1 + dv2;
		} catch (Exception erro) {
			return " Não deu";
		}
		
	}
	
public static void main(String[] args) {
		
	//Variáveis
	String cpf = lerCPF();
	System.out.println(cpf + calcularDV(cpf));
	}

}
