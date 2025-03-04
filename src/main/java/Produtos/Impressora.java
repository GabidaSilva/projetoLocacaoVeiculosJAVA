package Produtos;

 public class Impressora extends Produto {
    public Impressora(String modelo, String codigoDeBarras, double valor){
        super(modelo, codigoDeBarras, valor );
    }

    @Override
    public String getTipo() {
        return "Impressora";
    }
}