package aula02;

import java.util.Scanner;

public class MainFuncionario {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Funcionario f1 = new Funcionario(); //Criando o objeto

        System.out.println("### CADSTRO DE FUNCIONÀRIO ###");

        System.out.print("Nome: ");
        f1.nome = teclado.nextLine();

        System.out.print("Salário Bruto: ");
        f1.salarioBruto = teclado.nextDouble(); //Lendo Double

        System.out.print("Porcentagem do Desconto (0-100): ");
        f1.porcentagemDesconto = teclado.nextDouble();

        //Processando e exibindo
        f1.imprimirContracheque();
    }
}
