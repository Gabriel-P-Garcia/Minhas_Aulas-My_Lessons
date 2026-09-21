package aula08;

public class MatrizEsparsa {
	// Propriedades da classe
	private Diretor cabeca = null;
	private int modulo = 0;

	// Metodo contrutor cheio da classe
	public MatrizEsparsa(int modulo) {
		this.modulo = modulo;
	}

	// Metodos da classe
	private Diretor procurarDiretor(int numero) {
		int resto = (numero % modulo);

		Diretor ponteiro = cabeca;
		while ((ponteiro != null) && (ponteiro.getResto() != resto)) {
			ponteiro = ponteiro.getProximoDiretor();
		}

		// Cenário de resto encontrado
		if (ponteiro != null) {
			return ponteiro;
		}

		// Cenário de resto NÃO encontrado
		cabeca = new Diretor(resto, null, cabeca);
		return cabeca;
	}

	public void inserir(int numero) {
		Diretor ponteiroDiretor = procurarDiretor(numero);

		ponteiroDiretor.setProximoNo(new No(numero, ponteiroDiretor.getProximoNo()));
	}

	public void excluir(int numero) {
		Diretor ponteiroDiretor = procurarDiretor(numero);

		// Cenário muito fácil: lista vazia
		if (ponteiroDiretor.getProximoNo() == null) {
			return;
		}

		// Cenário facil: excluir o primeiro
		if (ponteiroDiretor.getProximoNo().getNumero() == numero) {
			ponteiroDiretor.setProximoNo(ponteiroDiretor.getProximoNo().getProximo());
			// getproximo.getproximo é 2 vezes o proximo

			return;
		}

		// Procura do numero a ser excluir
		No anterior = ponteiroDiretor.getProximoNo();
		while ((anterior.getProximo() != null) && (anterior.getProximo().getNumero() != numero)) {
			anterior = anterior.getProximo();
		}

		// Cenário dificil: não foi encontrado o número
		if (anterior.getProximo() == null) {
			return;
		}
		
		//Cenário difícil: o número foi encontrado
		anterior.setProximo(anterior.getProximo().getProximo());
	}
	public void imprimir() {
		System.out.println("Resto \t Números");
		Diretor ponteiroDiretor = cabeca;
		while(ponteiroDiretor != null) {
			System.out.print(ponteiroDiretor.getResto() + "\t ");
			No ponteiroNo = ponteiroDiretor.getProximoNo();
			while (ponteiroNo != null) {
				System.out.print(ponteiroNo.getNumero() + ", ");
				ponteiroNo = ponteiroNo.getProximo();
			}
			System.out.println();
			ponteiroDiretor = ponteiroDiretor.getProximoDiretor();
		}
	}

}
