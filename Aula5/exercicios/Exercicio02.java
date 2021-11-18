
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        final int QTDE_NUMEROS = 10;
        Scanner teclado = new Scanner(System.in);
        int numero, qtdePares;

        qtdePares = 0;

        for (int cont = 1; cont <= QTDE_NUMEROS; cont++) {
            System.out.println("Digite um valor inteiro:");
            numero = teclado.nextInt();

            if(numero % 2 == 0) {
                qtdePares++;
            } 
        }

        // System.out.println("Foram digitados " + qtdePares + " números pares");
        System.out.printf("Foram digitados %d números pares\n", qtdePares);
        System.out.printf("Foram digitados %d números impares\n", QTDE_NUMEROS - qtdePares);

        teclado.close();
    }
}