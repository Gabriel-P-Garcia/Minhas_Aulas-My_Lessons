package aula02;

public class Funcionario {
    //Atributos
    String nome;
    double salarioBruto;
    double porcentagemDesconto;
    double desconto;

    //Metodo para calcular valor real
    public double calcularSalarioLiquido(){
        this.desconto = this.porcentagemDesconto/100 * this.salarioBruto;
        return this.salarioBruto - this.desconto;
    }

    //Metodo para exibir relatorio
    public void imprimirContracheque(){
        System.out.println("\n================================");
        System.out.println("       FOLHA DE PAGAMENTO       ");
        System.out.println("================================");
        System.out.println("Funcionário: " + this.nome.toUpperCase());

        // Usando printf para formatar com 2 casas decimais
        System.out.printf("Salário Bruto:    R$ %,10.2f\n", this.salarioBruto);
        System.out.printf("SALÁRIO LÍQUIDO:  R$ %,10.2f\n", this.calcularSalarioLiquido());
        System.out.printf("Desconto (%2.0f%%):  - R$ %,10.2f\n", this.porcentagemDesconto, this.desconto);
        System.out.println("================================");
    }
}
