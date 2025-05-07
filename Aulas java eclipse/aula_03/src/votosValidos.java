import java.util.Scanner;

public class votosValidos {
	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	
//Declaração de variáveis
	double candA = 0;
	double candB = 0;
	double candC = 0;
	double branco = 0;
	double nulo = 0;
	double totalVotos = 0;
	double totalVotosValidos = 0;
	double candAPorcen = 0;
	double candBPorcen = 0;
	double candCPorcen = 0;
	double brancoPorcen = 0;
	double nuloPorcen = 0;
	
//Entrada de dados
	System.out.print("Votos do candidato A: ");
		candA = leitor.nextDouble();
	System.out.print("Votos do candidato B: ");
		candB = leitor.nextDouble();
	System.out.print("Votos do candidato C: ");
		candC = leitor.nextDouble();
	System.out.print("Total de votos em banco: ");
		branco = leitor.nextDouble();
	System.out.print("Total de votos nulos: ");
		nulo = leitor.nextDouble();
	
	leitor.close();

//Processamento
	totalVotos = (candA + candB + candC + branco + nulo);
	totalVotosValidos = (candA + candB + candC);
	candAPorcen = ((candA * 100) / totalVotosValidos);
	candBPorcen = ((candB * 100) / totalVotosValidos);
	candCPorcen = ((candC * 100) / totalVotosValidos);
	brancoPorcen = ((branco * 100) / totalVotos);
	nuloPorcen = ((nulo * 100) / totalVotos);
	
//Saida de dados
	System.out.println("O porcentual do Candidato A é: " + candAPorcen);
	System.out.println("O porcentual do Candidato B é: " + candBPorcen);
	System.out.println("O porcentual do Candidato C é: " + candCPorcen);
	System.out.println("O porcentual de votos em Branco é: " + brancoPorcen);
	System.out.println("O porcentual de votos nulos é: " + nuloPorcen);
	}
}
