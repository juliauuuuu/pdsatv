package atvPDS;

public class BoutiqueAPP {

    public static void main(String[] args) {
        System.out.println("--- FLUXO DE COMPRA SIMPLIFICADO ---");

        Produto vestido = new Produto();
        Cliente cliente = new Cliente();
        Carrinho carrinho = new Carrinho();
        Compra transacao = new Compra();
        Estoque gerenciadorEstoque = new Estoque();

        cliente.saudar();
        cliente.solicitarFidelidade(true);
        vestido.exibirDetalhes();

        if (vestido.verificarDisponibilidade(1)) {
            double precoSimples = vestido.aplicarDesconto(0.10);
            carrinho.adicionarItem("Vestido");
            double valorCompra = carrinho.calcularTotal(precoSimples, 1);

            transacao.iniciarTransacao();
            transacao.registrarVendedor("Juliana", 5);

            if (cliente.pagar(valorCompra)) {
                String resumo = transacao.finalizarTransacao(valorCompra);
                System.out.println(resumo);

                int novoNivel = gerenciadorEstoque.atualizarEstoque("Vestido", 1);
                gerenciadorEstoque.alertaNivelBaixo();
            }
        }
	}
}