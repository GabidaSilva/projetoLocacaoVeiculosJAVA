package Veiculos;

public class Moto extends Veiculo {
    public Moto (String modelo, String placa, double valorDiaria){
        super(modelo, placa, valorDiaria );
    }




    @Override
    public String getTipo() { return "Moto"; }
}