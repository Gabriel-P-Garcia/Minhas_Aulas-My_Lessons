package aula_06;

import java.util.Scanner; //Este programa é para calcular uma equação de 2° grau

public class Equacao2Grau {
	public static void main(String[] args) {
	Scanner leitor = new Scanner (System.in);
	
//Variáveis
	double a = 0;
	double b = 0;
	double c = 0;
	double delta = 0;
	double x1 = 0;
	double x2 = 0;
	
//Entrada de dados
	System.out.print("Digite o valor do a: ");
		a = leitor.nextDouble();
	System.out.print("Digite o valor do b: ");
		b = leitor.nextDouble();
	System.out.print("Digite o valor de c: ");
		c = leitor.nextDouble();
		
	leitor.close();
	
//Processamento
		delta = ((Math.pow(b, 2)) - 4 * a * c);

		if (delta >=0) {
			x1 = ((-b + Math.sqrt(delta)) / (2 * a));
			x2 = ((-b - Math.sqrt(delta)) / (2 * a));
		}
			
//Saída de dados
		if (delta < 0) {
		System.out.println("Não existem raizes reais para essa equação!");
		} else if (delta == 0) {
		System.out.println("Há uma única raiz real para essa equação, ela é " + x1);
		} else {
		System.out.println("Há duas raízes reais para essa equação, elas são " + x1 + " e " + x2);
		}
	}
}
