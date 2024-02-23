package Pessoa;

public class PessoaJuridica extends DadosEmComum{

    private String razaoSocial;

    @Override
    public String nome() {
        return null;
    }

    @Override
    public Long cpfOuCnpj() {
        return null;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    
    
}
