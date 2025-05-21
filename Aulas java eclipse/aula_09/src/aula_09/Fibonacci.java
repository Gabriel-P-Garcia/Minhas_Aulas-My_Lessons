package aula_09;

public class Fibonacci { 
// esse programa é para exibir numeros na sequencia de Fibonacci
public static void main (String[] args) {

//Variáveis
	
	double anterior = 1;
	double atual = 1;
	double futuro = 0;
	
//Processamento
	System.out.println(anterior);
	System.out.println(atual);
	while (true) {
		futuro = (anterior + atual);
		System.out.println(futuro);
		anterior = atual;
		atual = futuro;
		try {Thread.sleep(100);} catch(Exception e) {}
		
	}
}

}
