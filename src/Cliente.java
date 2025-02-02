abstract class Cliente {
    public String id;
    protected String nome;
    protected String documento;
    protected String endereco;
    protected String telefone;

    public Cliente (String nome, String documento, String endereco, String telefone){
        this.nome = nome;
        this.documento = documento;
        this.endereco = endereco;
        this.telefone = telefone;
    }
}
