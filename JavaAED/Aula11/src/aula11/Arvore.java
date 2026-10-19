package aula11;

public class Arvore {
	private No raiz = null;
	private int contador = 0;
	
	//Métodos de classe
	public void inserir(int numero) {
		raiz = inserir(raiz,numero);
	}
	
	private No inserir(No raiz, int numero) {
		//Cenário fácil: árvore vazia
		if (raiz == null) {
			return new No(numero,null,null);
		}
		
		//Cenário dificil: arvore NÃO vazia
		if (numero < raiz.getNumero()) {
			raiz.setEsquerda(inserir(raiz.getEsquerda(), numero));
		} else {
			raiz.setDireita(inserir(raiz.getDireita(), numero));
		}
		
		return raiz;
	}
	
	public void procurar(int numero) {
		procurar(raiz,numero);
	}
	
	private void procurar (No raiz, int numero) {
		//Cenário MUITO fácil: árvore vazia
		if (raiz == null) {
			System.out.println("NÃO encontrei o número em " + contador + " tentativas!");
			contador = 0;
			return;
		}
		
		//Cenário fácil: dei sorte e o número está na raiz
		if (raiz.getNumero() == numero) {
			System.out.println("ACHEI! Em " + contador + " tentativas");
			contador = 0;
			return;
		}
		
		//Cenário difícil: o número NÃO está na raiz
		contador++;
		if (numero < raiz.getNumero()) {
			procurar(raiz.getEsquerda(), numero);
		} else {
			procurar(raiz.getDireita(), numero);
		}
	}
	
	public void navegarEmOrdem() {
		System.out.print("Navegação EM-ORDEM: ");
		navegarEmOrdem(raiz);
		System.out.println();
	}
	
	private void navegarEmOrdem(No raiz) {
		if (raiz == null) return;
		
		navegarEmOrdem(raiz.getEsquerda());
		System.out.print(raiz.getNumero());
		navegarEmOrdem(raiz.getDireita());
	}
}
