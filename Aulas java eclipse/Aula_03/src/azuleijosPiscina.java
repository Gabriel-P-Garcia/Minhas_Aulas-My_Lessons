import java.util.Scanner;
//Esse programa é para contar o número de azuleijos de uma piscina após dar as proporções da piscina de de um azuleijo
public class azuleijosPiscina {
 public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);

//Declaração de variáveis
	double comprimento = 0;
	double largura = 0;
	double profundidade = 0;
	double tamanhoazuleijo = 0;
	double azuleijonecessarios = 0;
	
//Entrada de dados
	System.out.print("Comprimento da piscina: ");
		comprimento = leitor.nextDouble();
		
	System.out.print("Largura da piscina: ");
		largura = leitor.nextDouble();
		
	System.out.print("Profundidade da piscina: ");
		profundidade = leitor.nextDouble();
		
	System.out.print("Tamanho do azuleijo: ");
		tamanhoazuleijo = leitor.nextDouble();
	
	leitor.close();
//Processamento
	azuleijonecessarios = ((comprimento * largura) + (profundidade * largura * 2) + (comprimento * profundidade * 2) / Math.pow(tamanhoazuleijo, 2));
	
//Saida de dados
	System.out.print("Vão ser necessários " + azuleijonecessarios + " azuleijos");
 }
 
}
