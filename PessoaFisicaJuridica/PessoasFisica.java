package PessoaFisicaJuridica;

public class PessoasFisica extends DadosEmComum {

    private int idade;

    @Override
    public String nome() {
        return null;
    }

    @Override
    public Long cpfOuCnpj() {
        return null;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    
}