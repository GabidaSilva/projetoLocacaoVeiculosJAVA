package Veiculos;

class Caminhao extends Veiculo {
    public Caminhao(String modelo, String placa, double valorDiaria){
        super(modelo, placa, valorDiaria );
    }

    @Override
    public String getTipo() {
        return "Caminhão";
    }
}