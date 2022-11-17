import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();

        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sergio Lopes");
        alunos.add("Renan Saggio");


        for (String aluno: alunos) {
            System.out.println(aluno);
        }

        System.out.println(alunos);

        // Dentro do Set não há uma ordem de elementos e não aceita elementos duplicados

        boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira"); // A vantagem dos Set está na performance e velocidade para alguns métodos como o de buscar e de deletar
        System.out.println(pauloEstaMatriculado);
    }
}
