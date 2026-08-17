package Aula04;

public class Lista {
	//Propriedades da classe
	
	private No cabeca = null;
	
	//Métodos da classe
	public void inserir (int numero) {
		//tem duas referencias na cabeça na proxima linha, a da direita é a cabeça velha, a da esqueda é a cabeça nova
		cabeca = new No(numero,null,cabeca);
		if (cabeca.getProximo() != null) {
			cabeca.getProximo().setAnterior(cabeca);
		}
	}
	
	public void excluir(int numero) {
		//Caso MUITO facil, lista vazia
		if(cabeca == null) {
			return;
		}
		//Caso fácil: excluir o primeiro nó da lista
		if (cabeca.getNumero() == numero) {
			cabeca = cabeca.getProximo();
			if (cabeca != null) {
				cabeca.setAnterior(null);
			}
			return;
		}
		
		//Procura do número a ser excluirdo
		No ponteiro = cabeca;
		while((ponteiro != null) && (ponteiro.getNumero() != numero)) {
			ponteiro = ponteiro.getProximo();
		}
		
		//Caso dificil: o número NÃO foi encontrado
		if(ponteiro == null) {
			return;
		}
		
		//Caso MUITO difícil: o número foi encontrado
		ponteiro.getAnterior().setProximo(ponteiro.getProximo());
		if(ponteiro.getProximo() != null) {
			ponteiro.getProximo().setAnterior(ponteiro.getAnterior());

		}
	}
	
	public void imprimir() {
		No ponteiro = cabeca;
		while(ponteiro != null) {
			System.out.println(ponteiro.getNumero());
			ponteiro = ponteiro.getProximo();
		}
	}
}
