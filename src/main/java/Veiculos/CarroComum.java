package Veiculos;

public class CarroComum extends Veiculo {

    public CarroComum(String modelo, String placa, double valorDiaria) {
        super(modelo, placa, valorDiaria);

    }

    @Override
    public String getTipo() {
        return "Carro";
    }
}
