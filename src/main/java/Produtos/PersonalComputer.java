package Produtos;

public class PersonalComputer extends Produto implements ComodidadeAdicional {

    private boolean bluetooth;
    private boolean cameraDeVideo;

    public PersonalComputer(String modelo, String codigoDeBarras, double valor){
        super(modelo, codigoDeBarras, valor);
        this.bluetooth = true;
        this.cameraDeVideo = true;
    }

    @Override
    public boolean ofereceComodidadeAdicional() {
        return true; // Personal computer oferece dois diferenciais da comodidade adicional
    }

    @Override
    public String getTipo() {
        return "Personal Computer";
    }

    @Override
    public void oferecerComodidadeAdicional(){
        System.out.println("Comodidade Adicional para " + getModelo());
    }
}

