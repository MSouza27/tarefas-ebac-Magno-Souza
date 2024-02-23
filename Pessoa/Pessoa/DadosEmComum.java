package Pessoa;

public abstract class DadosEmComum {
    
    private String nome;
    private Long cpfOuCnpj;

    public abstract String nome();
    public abstract Long cpfOuCnpj();
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Long getCpfOuCnpj() {
        return cpfOuCnpj;
    }
    public void setCpfOuCnpj(Long cpfOuCnpj) {
        this.cpfOuCnpj = cpfOuCnpj;
    }

    
}
