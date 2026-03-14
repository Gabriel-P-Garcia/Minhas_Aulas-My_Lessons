package aula04.avaliacao;

import java.util.Random;
import java.util.Scanner;

public class ClasseInSistema {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Inputs
        System.out.println("Digite o nome do passageiro: ");
        var nomeInput = teclado.nextLine();

        System.out.print("Digite a localidade de destino: ");
        var destinoInput = teclado.nextLine();

        System.out.print("Qual a classe do Voo (1 - Econômica, 2 - Executiva, 3 - Primera Classe): ");
        var classeInput = teclado.nextInt();

        //Criando o Random
        Random assento = new Random();
        var fileira = assento.nextInt(32);
        String letraCadeira = "ABCDEF";
        var cadeira = letraCadeira.charAt(assento.nextInt(letraCadeira.length()));
        var assentoSorteado = "%02d%c".formatted(fileira,cadeira);

        //Criando o Record
        var infoPassagem = new Passagem(nomeInput,destinoInput,classeInput);

        //Definindo o switch do beneficio da classe
        var beneficio = switch(classeInput){
            case 1 -> "Lanche e Refrigerante";
            case 2 -> "Jantar VIP e Wi-Fi";
            case 3 -> "Suite e Degustação";
            default -> "Nenhum";
        };

        //Text block do cartão de embarque
        var cartaoEmbarque = """
                -----------------------------------
                CARTÂO DE EMBARQUE - JAVA 25
                -----------------------------------
                PASSAGEIRO:     %-35s
                DESTINO:        %-35s
                ASSENTO:        %-35s
                BENEFÍCIO:      %-35s
                -----------------------------------
                """.formatted(
                infoPassagem.passageiro,
                infoPassagem.destino,
                assentoSorteado,
                beneficio
                );
        System.out.print(cartaoEmbarque);
        teclado.close();
    }
    //Definindo o record
    public record Passagem(String passageiro, String destino, int classe){
    }
}
