package aula_02;

import java.util.Calendar;
import java.util.Scanner;

public class idade {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
	
	//Declaração de variáveis
		int diaNascimento = 0;
		int mesNascimento = 0;
		int anoNascimento = 0;
		
			int diaHoje = 0;
			int mesHoje = 0;
			int anoHoje = 0;
		
				int diaQtd = 0;
				int mesQtd = 0;
				int anoQtd = 0;
		
	//Entrada de dados
		System.out.print("Dia do nacimento: ");
			diaNascimento = leitor.nextInt();
		System.out.print("Mês do nacimento: ");
			mesNascimento = leitor.nextInt();
		System.out.print("Ano do nacimento: ");
			anoNascimento = leitor.nextInt();
			
		leitor.close();
		
	//Processamento de dados
		diaHoje = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		mesHoje = Calendar.getInstance().get(Calendar.MONTH) +1;
		anoHoje = Calendar.getInstance().get(Calendar.YEAR);
		
		diaQtd = Math.abs(diaHoje - diaNascimento);
		mesQtd = Math.abs(mesHoje - mesNascimento);
		anoQtd = Math.abs(anoHoje - anoNascimento);
		
		if (mesNascimento > mesHoje) {
			anoQtd = anoQtd - 1;
		}
		
	//Saida de dados
		System.out.println("A diferença de dias é: " + diaQtd);
		System.out.println("A diferença de meses é: " + mesQtd);
		System.out.println("A diferença de anos é: " + anoQtd);
	}

}
