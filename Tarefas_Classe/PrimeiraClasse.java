public class PrimeiraClasse {
    public static void main(String[] args) {
        
        Aluno aluno = new Aluno();
        aluno.cadastrarAluno("Magno Souza");

        Professor professor = new Professor();
        professor.cadastrarProfessor("Marllon Santos");

        Classe classe = new Classe();
        classe.cadastrarClasse(1);

        System.out.println(aluno.getAluno());
        System.out.println(professor.getProfessor());
        System.out.println(classe.getClasse());
    }
    
}
