

import java.util.Scanner;

public class Exercicio03 {
    
    public static void main(String[] args) {
        final int NUMERO_ALUNOS = 3;
        final int NUMERO_TURMAS = 2;    
        Scanner teclado = new Scanner(System.in);
        double mediaAluno, mediaTurma, mediaGeral;

        mediaGeral = 0;

        for (int turma = 1; turma <= NUMERO_TURMAS; turma++){
            System.out.println("Turma" + turma);

            mediaTurma = 0;

            for (int aluno = 1; aluno <= NUMERO_ALUNOS; aluno++) {
                System.out.printf("Informe a média do aluno %d: ", aluno);
                mediaAluno = teclado.nextDouble();

                mediaTurma = mediaTurma + mediaAluno;
            }

            mediaTurma = mediaTurma / NUMERO_ALUNOS;
            System.out.printf("Média da turma: %.2f\n\n", mediaTurma);

            mediaGeral = mediaGeral + mediaTurma;

        }

        mediaGeral = mediaGeral / NUMERO_TURMAS;
        System.out.println("Média Geral: " + mediaGeral);

        teclado.close();
    }
}
