package Pessoa;

public class Pessoaf{

    private String nome;
    private long cpf;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public long getCpf() {
        return cpf;
    }
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    public void cadastrarNomepf(String nome) {
        this.nome = nome;
    }
    public void cadastrarCpf(long cpf) {
        this.cpf = cpf;
    }

    
}
