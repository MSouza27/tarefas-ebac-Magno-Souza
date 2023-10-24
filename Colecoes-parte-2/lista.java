import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class lista {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> lista = new ArrayList<String>();
        List<String> homens = new ArrayList<String>();
        List<String> mulheres = new ArrayList<String>();

        System.out.println("Digite os nomes ou digite (fim) para finalizar o programa: ");


        while(true){
            String nome = scanner.nextLine();
            if(nome.equals("fim")){
                break;
            }
            lista.add(nome);

            System.out.print("Sexo (M/F): ");
            String sexo = scanner.nextLine();

            if(sexo.equalsIgnoreCase("M")){
                homens.add(nome);
            }else if (sexo.equalsIgnoreCase("F")){
                mulheres.add(nome);
            }else{
                System.out.println("Sexo Inavalido");
            }
        }

        Collections.sort(homens);
        Collections.sort(mulheres);

        System.out.println("Nomes dos Homens em ordem alfabética");
        for (String nome : homens){
            System.out.println(nome);
        }
                System.out.println("Nomes dos Mulheres em ordem alfabética");
        for (String nome : mulheres){
            System.out.println(nome);
        }

    scanner.close();
   }
    
}
