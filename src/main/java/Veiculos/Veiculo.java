package Veiculos;

public abstract class Veiculo {
    protected String modelo;
    protected String placa;
    protected double valorDiaria;
    private boolean disponivel;

    public Veiculo(String modelo, String placa, double valorDiaria) {
        this.modelo = modelo;
        this.placa = placa;
        this.valorDiaria = valorDiaria;
        this.disponivel = true;  // Por padrão, o veículo está disponível
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void alugar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Veículo " + modelo + " alugado.");
        }
    }

    public void devolver() {
        disponivel = true;
        System.out.println("Veículo " + modelo + " devolvido.");
    }

    public abstract String getTipo();
}





