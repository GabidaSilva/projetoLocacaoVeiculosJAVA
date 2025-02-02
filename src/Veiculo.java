abstract class Veiculo{
    public String id;
    protected String modelo;
    protected String placa;
    protected double valorDiaria;
    protected boolean disponivel;

    public Veiculo (String modelo, String placa, double valorDiaria){
        this.modelo = modelo;
        this.placa = placa;
        this.valorDiaria = valorDiaria;
        this.disponivel = true;
    }

    public boolean isDisponivel(){
        return disponivel;
    }

    public void alugar(){
        if (disponivel = false) {
            System.out.println(modelo + "alugado com sucesso!");
        }else{
            System.out.println(modelo + "não está disponível!");
        }
    }

    public void devolver (){
        disponivel = true;
        System.out.println(modelo + "devolvido!");
    }

    public double calcularValorLocacao(int dias){
        return dias * valorDiaria;
    }
}
