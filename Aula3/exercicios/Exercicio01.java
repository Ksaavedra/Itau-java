package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        double metade;

        // Entrada de dados
        System.out.println("Digite um número inteiro:");
        numero = entrada.nextInt();

        // Processamento
        if (numero > 20) {
            // metade = numero / 2.0;
            metade = (double) numero / 2; // casting
            // Saída de dados
            System.out.println("Metade = " + metade);
        }
        entrada.close();
    }
}