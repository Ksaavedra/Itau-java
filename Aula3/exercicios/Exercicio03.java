package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1, n2;

        System.out.println("Digite o primeiro número:");
        n1 = entrada.nextInt();
        System.out.println("Digite o segundo número:");
        n2 = entrada.nextInt();

        if(n1 > n2) {
            System.out.println(n1 + ", " + n2);
        } else {
            System.out.println(n2 + ", " + n1);
        }

        entrada.close();
    }
}