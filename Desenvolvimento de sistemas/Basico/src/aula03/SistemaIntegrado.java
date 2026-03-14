package aula03;

import java.util.Scanner;

public class SistemaIntegrado {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int menu = 0;

        //WHILE: Mantém o programa rodando até o usuário sair
        while (menu != 3){
            System.out.println("\n--- SISTEMA INTEGRADO V1.0 (JAVA 25) ---");
            System.out.println("1. Validar acesso (IF/ELSE)");
            System.out.println("2. Rodar Teste de Carga (FOR)");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            menu = leitor.nextInt();

            //SWITCH: Gerencia as opções do menu
            switch(menu){
                case 1 -> {
                    System.out.print("Informe a idade do usuário: ");
                    int idade = leitor.nextInt();

                    if(idade >= 18){
                        System.out.println(">> ACESSO TOTAL LIBERADO");
                    } else if (idade >= 16){
                        System.out.println(">> ACESSO RESTRITO (Apenas Consulta)");
                    } else{
                        System.out.println(">> ACESSO NEGADO");
                    }
                }
                case 2 -> {
                    System.out.print("Quantos ciclos de teste deseja rodar?");
                    int ciclos = leitor.nextInt();

                    //FOR: Repetição controlada
                    for (int i = 1; i <= ciclos; i++){
                        System.out.println("Executando ciclo #" + i + "... OK");
                    }
                }
                case 3 -> System.out.println("Encerrando o sistema...");
                default -> System.out.println("Opção inválida! Tente novamente");
            }
        }
        leitor.close();
    }

}
