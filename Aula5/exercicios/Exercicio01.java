

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int QTDE_NUMEROS = 10; // constante, não pode mudar de valor
        int numero, cont, maior;

        maior = Integer.MIN_VALUE; // o menor inteiro possível
        
        cont = 1;
        while (cont <= QTDE_NUMEROS) {
            System.out.println("Digite um número:");
            numero = teclado.nextInt();

            if (numero > maior) {
                maior = numero;
            }

            cont++; // cont = cont + 1;
        }

        System.out.println("Maior = " + maior);

        teclado.close();

    }
}