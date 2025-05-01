package aula_08;

public class DescobridorDePrimos {
//Esse programa é para descobrir numeros primos
public static void main (String [] args) {
	
//Variaveis
	long candidatoPrimo = 0;
	
	while(true) {
		boolean ehPrimo = true;
		candidatoPrimo ++;
		
		for(long i = 2; i < (candidatoPrimo/2); i++) {
			if (candidatoPrimo % i == 0) {
				ehPrimo = false;
				break;
			}
		}
		if(ehPrimo ) {
			System.out.println(candidatoPrimo);
		}
	}
}

}
