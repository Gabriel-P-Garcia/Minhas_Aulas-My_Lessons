package aula_01;

public class TrocaValorVariavel {
	public static void main (String[] args) {
		int variavel1 = 17;
		int variavel2 = 53;
		
		System.out.println("Variável 1: " + variavel1);
		System.out.println("Variável 2: " + variavel2);
		
		int temporario = variavel1;
		variavel1 = variavel2;
		variavel2 = temporario;
		
		System.out.println("Variável 1: " + variavel1);
		System.out.println("Variável 2: " + variavel2);
	}
}
