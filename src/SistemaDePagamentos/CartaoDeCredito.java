package SistemaDePagamentos;

public class CartaoDeCredito implements MetodoPagamento {

    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("Pagamento via Cartão de Crédito no valor de R$ " + valor + " processado com sucesso.");
        return true;
    }
}
