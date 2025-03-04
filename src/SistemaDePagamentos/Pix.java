package SistemaDePagamentos;

public class Pix implements MetodoPagamento {

    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("Pagamento via Pix no valor de R$ " + valor + " processado com sucesso.");
        return true;
    }
}
