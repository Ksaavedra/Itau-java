package exemplos.exemplo02;

import java.util.ArrayList;

public class AppArray2 {
    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>();

        alunos.add("Antonio");
        alunos.add("Eduardo");
        alunos.add("Felipe");
        alunos.add("Kelly");
        alunos.add("Maycon");

        for (String nome : alunos) { // para cada "nome" da lista de "alunos"
            System.out.println(nome);
        }

        System.out.println();

        for (int i = alunos.size()-1; i >= 0; i--) {
            System.out.println(alunos.get(i));
        }
    }
}
