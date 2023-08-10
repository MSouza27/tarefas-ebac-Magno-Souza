import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {

        double nota1;
        double nota2;
        double nota3;
        double nota4;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as Notas: ");
        nota1 = sc.nextDouble();
        nota2 = sc.nextDouble();
        nota3 = sc.nextDouble();
        nota4 = sc.nextDouble();

        double total = nota1 + nota2 + nota3 + nota4;
        double media = total/4;

        if(media >= 7){
           System.out.println("Aluno Aprovado");
        }else if (media >= 5  && media < 7){
            System.out.println("Aluno em Recuperação");   
        }else{
            System.out.println("Reprovado");
        }
        
        sc.close();
    }
}