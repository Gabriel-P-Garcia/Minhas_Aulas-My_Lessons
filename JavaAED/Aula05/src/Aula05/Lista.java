package Aula05;

public class Lista {
	//Propriedades da classe
	private No cabeca = null;
	
	//Metodos da classe
	public void inserir(int numero) {
		//Cenario facil: lista vazia
		if (cabeca == null) {
			cabeca = new No(numero, cabeca);
			cabeca.setProximo(cabeca);
			return;
		}
		
		//Cenario dificil: lista NAO vazia
		No ultimo = cabeca;
		while(ultimo.getProximo() != cabeca) {
			ultimo = ultimo.getProximo();
		}
		ultimo.setProximo(new No(numero,cabeca));
	}
	public void excluir(int numero) {
		//Cenario MUITO facil:lista vazia
		if(cabeca == null) {
			return;
		}
		//Cenario facil: excluir o unico
		if ((cabeca.getNumero() == numero) && (cabeca.getProximo() == cabeca)) {
			cabeca = null;
			return;
		}
		
		//Cenario medio: excluir o primeiro
		if(cabeca.getNumero() == numero) {
			No ultimo = cabeca;
			while(ultimo.getProximo() != cabeca) {
				ultimo = ultimo.getProximo();
			}
			cabeca = cabeca.getProximo();
			ultimo.setProximo(cabeca);
			return;
		}
		
		//Cenario dificil: excluir no meio ou no fim
		No anterior = cabeca;
		while((anterior.getProximo() != cabeca) && (anterior.getProximo().getNumero() != numero)) {
			anterior = anterior.getProximo();
		}
		
		if(anterior.getProximo() == cabeca) {
			return; //Cenario nao foi encontrado
		}
		
		anterior.setProximo(anterior.getProximo().getProximo());
	}
	
	public void imprimir() {
		No ponteiro = cabeca;
		
		if (ponteiro == null) {
			return;
		}
		do {
			System.out.println(ponteiro.getNumero());
			ponteiro = ponteiro.getProximo();
		} while (ponteiro != cabeca);
	}
}
