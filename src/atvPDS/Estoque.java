package atvPDS;

public class Estoque {
    public int atualizarEstoque(String produtoNome, int quantidadeVendida) {
        System.out.println("Estoque: Diminuindo " + quantidadeVendida + " unidades de " + produtoNome + ".");
        return 9;
    }

    public boolean alertaNivelBaixo() {
        System.out.println("Estoque: Verificação de nível baixo concluída.");
        return false;
    }

    public void receberMercadoria(int quantidade) {
        System.out.println("Estoque: Adicionadas " + quantidade + " novas peças.");
    }
}