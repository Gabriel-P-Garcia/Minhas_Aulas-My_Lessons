package aula13;

public class Arvore {
	// Propriedades da classe
	private No raiz = null;

	// Métodos da classe
	int getAlturaDoNo(No raiz) {
		if (raiz == null)
			return 0;
		return raiz.getAltura();
	}

	private int getMaximoEntreDoisNumeros(int a, int b) {
		return (a > b) ? a : b;
	}

	private int getBalanco(No raiz) {
		// Se for um numero positivo, estou inclinado para esquerda, se for negativo,
		// para a direita
		if (raiz == null)
			return 0;
		return (getAlturaDoNo(raiz.getEsquerda()) - getAlturaDoNo(raiz.getDireita()));
	}

	No rotacionarEsquerda(No raizVelha) {
		// Correção dos ponteiros
		No raizNova = raizVelha.getDireita();
		raizVelha.setDireita(raizNova.getEsquerda());
		raizNova.setEsquerda(raizVelha);
		// Correção das alturas
		raizVelha.setAltura(
				getMaximoEntreDoisNumeros(getAlturaDoNo(raizVelha.getEsquerda()), getAlturaDoNo(raizVelha.getDireita()))
						+ 1);
		raizNova.setAltura(
				getMaximoEntreDoisNumeros(getAlturaDoNo(raizNova.getEsquerda()), getAlturaDoNo(raizNova.getDireita()))
						+ 1);

		// Retorno da raiz nova
		return raizNova;
	}

	No rotacionarDireita(No raizVelha) {
		// Correção dos ponteiros
		No raizNova = raizVelha.getEsquerda();
		raizVelha.setEsquerda(raizNova.getDireita());
		raizNova.setDireita(raizVelha);
		// Correção das alturas
		raizVelha.setAltura(
				getMaximoEntreDoisNumeros(getAlturaDoNo(raizVelha.getDireita()), getAlturaDoNo(raizVelha.getEsquerda()))
						+ 1);
		raizNova.setAltura(
				getMaximoEntreDoisNumeros(getAlturaDoNo(raizNova.getDireita()), getAlturaDoNo(raizNova.getEsquerda()))
						+ 1);

		// Retorno da raiz nova
		return raizNova;
	}

	public void inserir(int numero) {
		raiz = inserir(raiz, numero);
	}

	private No inserir(No raiz, int numero) {
		// Caso fácil: arvora vazia
		if (raiz == null) {
			return new No(numero, null, null, 1);
		}

		// Caso difícil: arvore NÃO vazia
		if (numero < raiz.getNumero()) {
			raiz.setEsquerda(inserir(raiz.getEsquerda(), numero));
		} else {
			raiz.setDireita(inserir(raiz.getDireita(), numero));
		}

		// Coreções de balanceamento
		raiz.setAltura(1 + getMaximoEntreDoisNumeros(getAlturaDoNo(raiz.getEsquerda()), getAlturaDoNo(raiz.getDireita())));
		int balanco = getBalanco(raiz);
		
		// Inclinação à esquerda, inserção de número à esquerda
		if ((balanco > 1) && (numero < raiz.getEsquerda().getNumero())) {
			raiz = rotacionarDireita(raiz);
		}
		
		//Inclinação à direita, inserção de número à direita
		if ((balanco < -1) && (numero > raiz.getDireita().getNumero())) {
			raiz = rotacionarEsquerda(raiz);
		}
		
		//Inclinação à esquerda, inserção de número maior à direita
		if ((balanco > 1) && (numero > raiz.getEsquerda().getNumero())) {
			raiz.setEsquerda(rotacionarEsquerda(raiz.getEsquerda()));
			raiz = rotacionarDireita(raiz);
		}
		
		//Inclinação à direita, inserção de número menor à esquerda
		if ((balanco < -1) && (numero < raiz.getDireita().getNumero())) {
			raiz.setDireita(rotacionarDireita(raiz.getDireita()));
			raiz = rotacionarEsquerda(raiz);
		}

		return raiz;
	}
	
	public void imprimir() {
		imprimir(raiz, "");
	}
	
	private void imprimir(No raiz, String indentacao) {
		if (raiz == null) return;
		
		System.out.println(indentacao +raiz.getNumero());
		imprimir(raiz.getEsquerda(), indentacao + "____");
		imprimir(raiz.getDireita(), indentacao + "____");
	}

}
