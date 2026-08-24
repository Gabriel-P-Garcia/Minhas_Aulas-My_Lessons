package Aula05;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		//Declaração de variaveis
		Scanner leitor = new Scanner(System.in);
		Lista objLista = new Lista();
		int opcao = 0;
		
		//processamento
		while(opcao != 5) {
			System.out.println("+============================+");
			System.out.println("+       Menu de Opção        +");
			System.out.println("+============================+");
			System.out.println("+ 1 - Inserir                +");
			System.out.println("+ 2 - Excluir                +");
			System.out.println("+ 3 - Imprimir               +");
			System.out.println("+ 4 - Cem Mila               +");
			System.out.println("+ 5 - Sair                   +");
			System.out.println("+============================+");
			System.out.println("Digite sua opção");
			opcao = leitor.nextInt();
			
			switch(opcao) {
				case 1:
					System.out.print("Digite um número");
					objLista.inserir(leitor.nextInt());
					break;
				case 2:
					System.out.print("Digite um número");
					objLista.excluir(leitor.nextInt());
					break;
				case 3:
					objLista.imprimir();
					break;
				case 4:
					for (int i = 0; i < 1000000; i++)
					objLista.inserir(i);
					break;
			}
		}
		leitor.close();
	}
}
