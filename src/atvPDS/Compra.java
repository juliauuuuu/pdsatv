package atvPDS;

public class Compra {
	public void iniciarTransacao() {
		System.out.println("Transacao: Iniciada a operação de venda.");
	}

	public String finalizarTransacao(double valorTotal) {
		return "Transacao: Fechada com sucesso. Valor total: R$" + valorTotal;
	}

	public void registrarVendedor(String nomeVendedor, int idVendedor) {
		System.out.println("Transacao: Vendedor " + nomeVendedor + " registrado.");
	}
}
