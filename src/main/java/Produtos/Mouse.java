package Produtos;

public class Mouse extends Produto {
    public Mouse(String modelo, String codigoDeBarras, double valor){
        super(modelo, codigoDeBarras, valor );
    }

    @Override
    public String getTipo() { return "Mouse"; }
}