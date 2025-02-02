class Locacao{
    private Cliente cliente;
    private Veiculo veiculo;
    private int dias;

    public Locacao(Cliente cliente, Veiculo veiculo, int dias){
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.dias = dias;
    }

    public void realizarLocacao(){
        if (veiculo.isDisponivel()){
            veiculo.alugar();
            double.valor = veiculo.calcularValorLocacao( dias );
            System.out.println("Locação realizada com sucesso! Valor total:R$ " + valor);
        }else{
            System.out.println("Veículo indisponível para locação.");
        }
    }
}
