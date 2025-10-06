package atvPDS;

public class Cliente {
    public void saudar() {
        System.out.println("\nCliente: Olá! Bem-vindo(a) à loja.");
    }

    public String solicitarFidelidade(boolean jaCadastrado) {
        return "Cliente: Status de Fidelidade solicitado.";
    }

    public boolean pagar(double valor) {
        System.out.println("Cliente: Processando pagamento de R$" + valor);
        return true;
    }
}