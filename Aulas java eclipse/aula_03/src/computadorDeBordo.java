import java.util.Scanner;
//Esse programa é para calcular a velocidade média e o consumo de gasolina de um carro

public class computadorDeBordo {
	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	
//Declaração de variáveis
	double distancia = 0;
	double tempo = 0;
	double consumo = 0;
	double velmedia = 0;
	double quantidadeLitros = 0;

//Entrada de dados
	System.out.print("Informe a distância: ");
		distancia = leitor.nextDouble();
	System.out.print("Quanto tempo: ");
		tempo = leitor.nextDouble();
	System.out.print("Informe o consumo do carro: ");
		consumo = leitor.nextDouble();
	
		leitor.close();
		
//Processamento
	velmedia = (distancia / tempo);
	quantidadeLitros = (distancia / consumo);
	
//Saida de dados
	System.out.println("A velocidade média é: " + velmedia + "km/h");
	System.out.println("O consumo por km é: " + quantidadeLitros + "km/l");
		
	}
}
