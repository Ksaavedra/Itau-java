

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, cont;

        System.out.println("Informe um número: ");
        numero = entrada.nextInt();

        cont= 0;
        while(cont <=50) {
            // System.out.println(numero + " x " + cont + " = " + (numero + cont));
            System.out.printf("%d x %d = %d" + numero, cont, numero * cont);
            cont ++;
        }
        entrada.close();
    }
}