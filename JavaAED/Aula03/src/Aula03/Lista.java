package Aula03;

public class Lista {
	// Propriedades da classe
	private No cabeca = null;

	// Métodos da classe
	public void inserir(int numero) {
		// Caso fácil: lista vazia
		if (cabeca == null) {
			cabeca = new No(numero, null);
			return;
		}

		// Caso difícil: lista NÃO vazia
		No ultimo = cabeca;
		while (ultimo.getProximo() != null) {
			ultimo = ultimo.getProximo();
		}
		ultimo.setProximo(new No(numero, null));
	}

	public void excluir(int numero) {
		// Caso mais fácil: lista vazia
		if (cabeca == null) {
			return;
		}

		// Caso fácil: excluir o primeiro numero da lista
		if (cabeca.getNumero() == numero) {
			cabeca = cabeca.getProximo();
			return;
		}
		
		//Caso difícil: excluir no meio ou no final da lista
		No anterior = cabeca;
		while((anterior.getProximo() != null) && (anterior.getProximo().getNumero() != numero)) {
			anterior = anterior.getProximo();
		}
		
		if (anterior.getProximo() == null) {
			//Caso em que foi tentada a exclusão de um número que não existe
			return;
		}
		
		//Caso da exclusão proriamente dita no meio ou no fim
		anterior.setProximo(anterior.getProximo().getProximo());
	
	}
	
	public void imprimir() {
		No ponteiro = cabeca;
		while(ponteiro != null) {
			System.out.println(ponteiro.getNumero());
			ponteiro = ponteiro.getProximo();
		}
	}
}
