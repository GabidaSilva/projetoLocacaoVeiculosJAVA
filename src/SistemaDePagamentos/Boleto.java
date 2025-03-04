package SistemaDePagamentos;

public class Boleto implements MetodoPagamento {

    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("Pagamento via Boleto no valor de R$ " + valor + " processado com sucesso.");
        return true;
    }
}
