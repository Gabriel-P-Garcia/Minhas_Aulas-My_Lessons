package aula06;

public class Pilha {
	// Propriedades da classe
	private No cabeca = null;

	// Metodos da classe
	public void push(int numero) {
		cabeca = new No(numero, cabeca);
	}

	public void pop() {
		// Caso muito fácil: pilha vazia
		if (cabeca == null) {
			return;
		}

		// Caso fácil: pilha não vazia
		System.out.println(cabeca.getNumero());
		cabeca = cabeca.getProximo();
	}
}
