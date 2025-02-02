class CarroPremium extends Veiculo implements ServicoLuxo{
    public CarroPremium(String modelo, String placa, double valorDiaria){
        super(modelo, placa, valorDiaria);
    }
    @Override
    public void oferecerServicoPremium(){
        System.out.println("Serviço de luxo ativado para "+ modelo);
    }
}
