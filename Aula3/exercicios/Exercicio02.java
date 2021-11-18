package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, media;

        // entrada
        System.out.println("Digite a primeira nota:");
        nota1 = entrada.nextDouble();
        System.out.println("Digite a segunda nota:");
        nota2 = entrada.nextDouble();

        // processamento
        media = nota1 * 0.4 + nota2 * 0.6;
        // media = (nota1 * 40 + nota2 * 60) / 100;

        if(media >= 6) {
            System.out.println("Aluno aprovado com média: " + media);
        } else {
            System.out.println("Aluno reprovado com média: " + media);
        }

        // saída
        entrada.close();
    }
}