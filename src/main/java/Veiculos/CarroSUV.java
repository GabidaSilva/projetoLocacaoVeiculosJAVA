package Veiculos;

class CarroSUV extends Veiculo implements ServicoLuxo{

    private boolean cambioAutomatico;
    private boolean computadorBordo;
    private boolean suspensaoAdaptativa;
    private boolean offRoad;


    public CarroSUV (String modelo, String placa, double valorDiaria){
        super(modelo, placa, valorDiaria);
        this.cambioAutomatico = true;
        this.computadorBordo = true;
        this.suspensaoAdaptativa = true;
        this.offRoad = true;
    }

    @Override
    public String getTipo() {
        return "CarroSUV";
    }

    @Override
    public boolean ofereceServicoLuxo() {
        return false;
    }

    @Override
    public void oferecerServicoPremium() {
        System.out.println("Serviço premium ativado para " + modelo);
    }
}
