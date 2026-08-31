package aula06;

public class Fila {

	// Propriedades da classe
	private No cabeca = null;

	// Metodos da classe
	public void entrar(int numero) {
		cabeca = new No(numero, cabeca);
	}

	public void sair() {
		// Caso fácil: fila vazia
		if (cabeca == null) {
			System.out.println("A fila está vazia!");
			return;
		}

		// Caso médio: a fila só tem um unico nó
		if (cabeca.getProximo() == null) {
			System.out.println(cabeca.getNumero());
			cabeca = null;
			return;
		}

		// Caso difícil, fila tem mais de um nó
		No ponteiro = cabeca;
		while (ponteiro.getProximo().getProximo() != null) {
			ponteiro = ponteiro.getProximo();
		}

		System.out.println(ponteiro.getProximo().getNumero());
		ponteiro.setProximo(null);
		

	}

}
