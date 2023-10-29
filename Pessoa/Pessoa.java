package Pessoa;

public class Pessoa {

    public static void main(String[] args) {

        Pessoaf pessoaf = new Pessoaf();
        pessoaf.cadastrarNomepf("Magno Souza");
        pessoaf.cadastrarCpf(222222L);

        Pessoaj pessoaj = new Pessoaj();
        pessoaj.cadastrarNomepj("BBB");
        pessoaj.cadastrarcnpj(111111L);
        pessoaj.cadastrarrazapSocial("TTT");

        System.out.println("Nome Pessoa Fisica: " + pessoaf.getNome());
        System.out.println("CPF Pessoa Fisica: " + pessoaf.getCpf());
        System.out.println("***********************");
        System.out.println("Nome CNPJ: " + pessoaj.getNome());
        System.out.println("CNPJ: " + pessoaj.getCnpj());
        System.out.println("Razao Social: " + pessoaj.getRazaoSocial());   

   }

}