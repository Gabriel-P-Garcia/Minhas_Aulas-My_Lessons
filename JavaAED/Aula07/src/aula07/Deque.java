package aula07;

public class Deque {

	// Propriedades da classe
	private No cabeca = null;

	// Métodos da classe
	public void entrarPelaEsquerda(int numero) {
		cabeca = new No(numero, cabeca);
	}

	public void entrarPelaDireita(int numero) {
		// Cenario fácil: deque vazio
		if (cabeca == null) {
			cabeca = new No(numero, cabeca);
			return;
		}

		// Cenário dificil: deque NÃO vazio
		No ultimo = cabeca;
		while (ultimo.getProximo() != null) {
			ultimo = ultimo.getProximo();
		}
		ultimo.setProximo(new No(numero, null));

	}

	public void sairPelaEsquerda() {
		// Cenário muito fácil: deque vazio
		if (cabeca == null) {
			return;
		}

		// Cenário facil: deque NÃO vazio
		System.out.println(cabeca.getNumero());
		cabeca = cabeca.getProximo();
	}

	public void sairPelaDireita() {
		// Cenário muito fácil: deque vazio
		if (cabeca == null) {
			return;
		}

		// Cenário fácil: deque com apenas um único nó
		if (cabeca.getProximo() == null) {
			System.out.println(cabeca.getNumero());
			cabeca = null;
			return;
		}

		// Cenário difícil: deque tem mais de um nó
		No penultimo = cabeca;
		while (penultimo.getProximo().getProximo() != null) {
			penultimo = penultimo.getProximo();
		}
		System.out.println(penultimo.getProximo().getNumero());
		penultimo.setProximo(null);
	}
	
	public void imprimir() {
		No ponteiro = cabeca;
		
		while(ponteiro != null) {
			System.out.println(ponteiro.getNumero());
			ponteiro = ponteiro.getProximo();
		}
	}
}
