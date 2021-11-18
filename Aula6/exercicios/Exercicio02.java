package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, c;
        int numeroMenor;

        System.out.println("Digte 3 números inteiros:");
        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();

        numeroMenor = menor(a, b, c);

        System.out.println("Menor = " + numeroMenor);

        entrada.close();
    }


    public static int menor(int n1, int n2, int n3) {
        if(n1 <= n2 && n1 <= n3) {
            return n1;
        }

        if(n2 <= n1 && n2 <= n3) {
            return n2;
        }

        return n3;
    }

}
