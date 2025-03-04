package Produtos;

public class Teclado extends Produto {

    public Teclado(String modelo, String codigoDeBarras, double valor) {
        super(modelo, codigoDeBarras, valor);

    }

    @Override
    public String getTipo() {
        return "Teclado";
    }
}
