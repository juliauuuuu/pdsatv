package atvPDS;

public class Carrinho {
    public void adicionarItem(String nomeProduto) {
        System.out.println("Carrinho: Adicionado item: " + nomeProduto);
    }

    public void removerItem(String nomeProduto) {
        System.out.println("Carrinho: Removido item: " + nomeProduto);
    }

    public double calcularTotal(double precoItem, int quantidade) {
        System.out.println("Carrinho: Calculando total simples.");
        return 50.0;
    }
}