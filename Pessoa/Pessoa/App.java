package Pessoa;

public class App {
    public static void main(String[] args) {
        
        PessoasFisica pessoasFisica = new PessoasFisica();
        pessoasFisica.setNome("Magno");
        pessoasFisica.setCpfOuCnpj(123456789L);
        pessoasFisica.setIdade(30);
    

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("BBB");
        pessoaJuridica.setCpfOuCnpj(11111111111L);
        pessoaJuridica.setRazaoSocial("Logista");


        System.out.println("Meu Nome: " + pessoasFisica.getNome());
        System.out.println("Meu CPF: " + pessoasFisica.getCpfOuCnpj());
        System.out.println("Minha Idade: " + pessoasFisica.getIdade());
        System.out.println("********************************");
        System.out.println("Nome da Empresa: " + pessoaJuridica.getNome());
        System.out.println("O CNPJ é: " + pessoaJuridica.getCpfOuCnpj());
        System.out.println("Minha razão Social é: " + pessoaJuridica.getRazaoSocial());

    }
}
