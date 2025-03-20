import java.util.Scanner;

public class imc {
	public static void main (String[] args) {
	Scanner leitor = new Scanner (System.in);
//Declaração de variaveis
	double peso = 0;
	double altura = 0;
	double imc = 0;
	String classe = null;
	
//Entrada de dados
	System.out.print("Digite o seu peso: ");
		peso = leitor.nextDouble();
		
	System.out.print("Digite a sua altura: ");
		altura = leitor.nextDouble();
		
	leitor.close();
	
//Processamento
	imc = (peso / Math.pow(altura,  2));
	
	if (imc <= 18.5) {
		classe = "Abaixo do normal";
	}
	if (imc >= 18.6 && imc < 25) {
		classe = "Normal";
	}
	if (imc >= 25 && imc < 30) {
		classe = "Sobrepeso";
	}
	if (imc >= 30 && imc < 35) {
		classe = "Obesidade Grau I";
	}
	if (imc >= 35 && imc < 40) {
		classe = "Obesidade Grau II";
	}
	if (imc >= 40) {
		classe = "Obesidade Grau III";
	}
	
//Saída de dados
	System.out.println("O seu IMC é: " + imc);
	System.out.println("A sua classe é: " + classe);
	}
}
