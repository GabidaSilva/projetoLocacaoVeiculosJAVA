class CarroSUV extends Veiculo implements ServicoLuxo {
    public CarroSUV (String modelo, String placa, double valorDiaria){
        super(modelo, placa, valorDiaria);;
    }

    @Override
    public void oferecerServicoPremium() {
        System.out.println("Serviço premium ativado para " + modelo);
    }
}
