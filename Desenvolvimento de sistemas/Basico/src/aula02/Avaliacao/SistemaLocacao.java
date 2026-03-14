package aula02.Avaliacao;

import java.util.Scanner;
import java.util.Locale;

public class SistemaLocacao {
    public static void main (String[] args) {
        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
        Veiculo v1 = new Veiculo();

        System.out.println("\n### REGISTRO DE LOCAÇÃO###");

        System.out.print("Modelo do veículo: ");
        v1.modelo = leitor.nextLine();

        System.out.print("Valor da diária: ");
        v1.valorDiaria = leitor.nextDouble();

        System.out.print("Dias de aluguel: ");
        v1.quantidadeDias = leitor.nextInt();

        v1.gerarRecibo();

    }
}
