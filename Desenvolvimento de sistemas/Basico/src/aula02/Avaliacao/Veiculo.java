package aula02.Avaliacao;

public class Veiculo {
    String modelo;
    double valorDiaria;
    int quantidadeDias;
    double totalAluguel;

    public double calcularTotal(){
        this.totalAluguel = this.valorDiaria * this.quantidadeDias;
        return totalAluguel;
    }

    public void gerarRecibo(){
        System.out.println("\nRECIBO");
        System.out.println("Modelo do veículo: " + this.modelo);
        System.out.println("Valor da diária: " + this.valorDiaria);
        System.out.println("Dias de aluguel: " + this.quantidadeDias);
        System.out.println("Valor total do aluguel: " + this.calcularTotal());
    }
}
