package aula03.Avalicao;

import java.util.Scanner;

public class AnaliseCredito {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int NumCliente = 0;
        String Veredito = "";

        System.out.println("Quantos clientes estão na fila? ");
        NumCliente = leitor.nextInt();

        leitor.nextLine();

        for (int i = NumCliente; i > 0; i--){
            System.out.println("Digite o nome completo do cliente " + i + ": ");
            String nome = leitor.nextLine();

            System.out.println("Digite a renda mensal do cliente " + i + ": ");
            int RendaMen = leitor.nextInt();

            System.out.println("Digite o tempo de emprego do cliente " + i + " em meses: ");
            int Mes = leitor.nextInt();

            leitor.nextLine();

            if (RendaMen > 10000 && Mes >= 12){
                Veredito = "Crédito VIP concedido";
            } else if (RendaMen >= 3000 && RendaMen <= 10000 && Mes > 24){
                Veredito = "Crédito Básico concedido";
            } else{
                Veredito = "Crédito Negado";
            }

            System.out.println("Nome do cliente: " + nome.toUpperCase());
            System.out.println("Renda Mensal: " + RendaMen);
            System.out.println("Tempo de emprego: " + Mes);
            System.out.println(Veredito);


        }
        leitor.close();
    }

}
