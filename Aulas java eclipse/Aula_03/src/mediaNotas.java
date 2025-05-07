import java.util.Scanner;
//Esse programa é para calcular a média de notas de um aluno
public class mediaNotas {
	public static void main(String[] args) {
	Scanner leitor = new Scanner (System.in);
	
//Declaração de variáveis
	double nota1 = 0;
	double nota2 = 0;
	double nota3 = 0;
	double media = 0;
	
//Entrada de dados
	System.out.print("Nota 1: ");
		nota1 = leitor.nextDouble();
	
	System.out.print("Nota 2: ");
		nota2 = leitor.nextDouble();
	
	System.out.print("Nota 3: ");
		nota3 = leitor.nextDouble();
		
	leitor.close();
	
//Processamento
	media = (nota1 + nota2 + nota3) /3;
	
//Saida de dados
	System.out.println("A média das notas é: " + media);
	}
	
}
