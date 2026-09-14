package aula07;

public class DequeBancario {
	// Propriedades da classe
	private No filaNormal = null;
	private No filaPreferencial = null;

	// Metodos de classe
	public void entrar (boolean normal, int numero) {
		if (normal) {
			filaNormal = new No(numero,filaNormal);
		} else {
			filaPreferencial = new No(numero,filaPreferencial);
		}
	}
	
	private No sair(No fila) {
		// Cenário muito facil: fila vazia
		if (fila == null) {
			return null;
		}
		
		//Cenario facil: fila so tem um unico no
		if (fila.getProximo() == null) {
			System.out.println(fila.getNumero());
			return null;
		}
		
		//Cenário dificil: fila tem mais de um nó
		No penultimo = fila;
		while (penultimo.getProximo().getProximo() != null) {
			penultimo = penultimo.getProximo();
		}
		System.out.println(penultimo.getProximo().getNumero());
		penultimo.setProximo(null);
		return fila;
	}
	
	private int contador = 0;
	public void atender() {
		//Cenário muito facil: ambas filas vazias
		if ((filaNormal == null) && (filaPreferencial == null)) {
			return;
		}
		
		//Cenário fácil: so tem gente na fila normal
		if (filaPreferencial == null) {
			filaNormal = sair(filaNormal);
			contador = 0;
			return;
		}
		
		//Cenário facil: so tem gente na preferencial
		if (filaNormal == null) {
			filaPreferencial = sair(filaPreferencial);
			contador = 0;
			return;
		}
		
		//Cenário dificil: tem gente nas duas filas
		if(contador < 3) {
			filaPreferencial = sair(filaPreferencial);
			contador++;
		} else {
			filaNormal = sair(filaNormal);
			contador = 0;
		}
	}
}
