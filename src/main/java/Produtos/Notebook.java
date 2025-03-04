package Produtos;

public class Notebook extends Produto implements ComodidadeAdicional {

    private boolean bluetooth;
    private boolean cameraDeVideo;
    private boolean telaRetina;
    private boolean processadorRayzen;


    public Notebook(String modelo, String codigoDeBarras, double valor){
        super(modelo, codigoDeBarras, valor);
        this.bluetooth = true;
        this.cameraDeVideo = true;
        this.telaRetina = true;
        this.processadorRayzen = true;
    }

    @Override
    public String getTipo() {
        return "Notebook";
    }

    @Override
    public boolean ofereceComodidadeAdicional() {
        return false;
    }

    @Override
    public void oferecerComodidadeAdicional() {
        System.out.println("Comodidade Adicional para " + modelo);
    }
}
