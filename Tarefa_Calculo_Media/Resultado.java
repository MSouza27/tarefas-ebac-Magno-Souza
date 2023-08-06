public class Resultado {

    public static void main(String[] args) {
        
        Nota1 nota1 = new Nota1();
        nota1.cadastrarNota1(10);

        Nota2 nota2 = new Nota2();
        nota2.cadastrarNota2(7);

        Nota3 nota3 = new Nota3();
        nota3.cadastrarNota3(7);

        Nota4 nota4 = new Nota4();
        nota4.cadastrarNota4(5);

       System.out.println(nota1.getNota1());
       System.out.println(nota2.getNota2());
       System.out.println(nota3.getNota3());
       System.out.println(nota4.getNota4());

       double total = (nota1.getNota1()+nota2.getNota2()+nota3.getNota3()+nota4.getNota4());

       System.out.println(total);

       double media = (nota1.getNota1()+nota2.getNota2()+nota3.getNota3()+nota4.getNota4())/4;
       System.out.println(media);
    
    }
    
}
