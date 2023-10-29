package Pessoa;

public class Pessoaj{

    private String nome;
    private long cnpj;
    private String razaoSocial;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public long getCnpj() {
        return cnpj;
    }
    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }
    public String getRazaoSocial() {
        return razaoSocial;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public void cadastrarNomepj(String nome) {
        this.nome = nome;
    }
    public void cadastrarcnpj(long cnpj) {
        this.cnpj = cnpj;

    }
    public void cadastrarrazapSocial(String razaosocial){
        this.razaoSocial = razaosocial;


    }

    
}
