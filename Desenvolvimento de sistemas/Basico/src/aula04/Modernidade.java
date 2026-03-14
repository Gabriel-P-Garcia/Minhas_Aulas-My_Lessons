package aula04;

import java.util.Locale;
import java.util.Scanner;

public class Modernidade {

    public static void main(String[] args) {
        var teclado = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("=== CADASTRO MODERNO JAVA 25 ===");
        System.out.print("Nome do Colaborador: ");
        var nomeInput = teclado.nextLine();

        System.out.print("Salário Base: ");
        var salarioInput = teclado.nextDouble();

        System.out.print("Cargo (DEV, DESIGNER, MANAGER): ");
        var cargoInput = teclado.next().toUpperCase();


        //Criando o Record (Imutabilidade e Segurança)
        var funcionario = new Colaborador(nomeInput, salarioInput, cargoInput);

        //Switch Expression para calcular bônus retornado valor
        var bonus = switch(funcionario.cargo()){
            case "DEV" -> funcionario.salario() * 0.20;
            case "DESIGNER" -> funcionario.salario * 0.50;
            case "MANAGER" -> funcionario.salario() * 0.25;
            default -> 0.0;
        };

        //Text block para gerar contracheque elegante

        var recibo = """
                -----------------------------------
                RECIBO DE PAGAMENTO - MÓDULO 2
                -----------------------------------
                COLABORADOR:    %s
                CARGO:          %s
                SALÁRIO:        R$ %.2f
                BÔNUS:          R$ %.2f
                TOTAL:          R$ %.2f
                -----------------------------------
                """.formatted(
                        funcionario.nome(),
                        funcionario.cargo(),
                        funcionario.salario(),
                        bonus,
                        (funcionario.salario() + bonus)
                 );
        System.out.println(recibo);
        teclado.close();
    }

    //Definindo o Record como transporador de dados imutável
    public record Colaborador(String nome, double salario, String cargo){
    }
}
