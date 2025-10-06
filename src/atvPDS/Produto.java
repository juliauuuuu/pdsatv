package atvPDS;

public class Produto {
    public void exibirDetalhes() {
        System.out.println("Produto: Exibindo detalhes de um vestido.");
    }

    public double aplicarDesconto(double percentual) {
        System.out.println("Produto: Novo sistema aplicando " + (percentual * 100) + "% de desconto.");
        return 50.0;
    }

    public boolean verificarDisponibilidade(int quantidadeDesejada) {
        System.out.println("Produto: Checando disponibilidade para " + quantidadeDesejada + " unidade(s).");
        return true;
    }

}
