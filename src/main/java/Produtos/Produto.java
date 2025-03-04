package Produtos;

public abstract class Produto {
    protected String modelo;
    protected String codigoDeBarras;
    protected double valor;
    private EstadoProduto estado;

    public Produto(String modelo, String codigoDeBarras, double valor) {
        this.modelo = modelo;
        this.codigoDeBarras = codigoDeBarras;
        this.valor = valor;
        this.estado = EstadoProduto.DISPONIVEL; // Padrão: disponível
    }

    public String getModelo() {
        return modelo;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public double getValor() {
        return valor;
    }

    public boolean isDisponivel() {
        return estado == EstadoProduto.DISPONIVEL;
    }

    public boolean isReservado() {
        return estado == EstadoProduto.RESERVADO;
    }

    public void reservar() {
        if (isDisponivel()) {
            estado = EstadoProduto.RESERVADO;
            System.out.println("Produto " + modelo + " foi reservado.");
        } else {
            System.out.println("Produto " + modelo + " não está disponível para reserva.");
        }
    }

    public void pagar() {
        if (isReservado()) {
            estado = EstadoProduto.ADQUIRIDO;
            System.out.println("Produto " + modelo + " foi pago e adquirido.");
        } else {
            System.out.println("Produto " + modelo + " não está reservado para pagamento.");
        }
    }

    public void devolver() {
        if (estado == EstadoProduto.ADQUIRIDO) {
            estado = EstadoProduto.DISPONIVEL;
            System.out.println("Produto " + modelo + " devolvido.");
        } else {
            System.out.println("Produto " + modelo + " não pode ser devolvido.");
        }
    }

    public abstract String getTipo();

    public void adquirir() {
    }

    private enum EstadoProduto {
        DISPONIVEL, RESERVADO, ADQUIRIDO
    }
}




