package exemplos;

import java.util.Scanner;

public class Exemplo02 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número inteiro:");
        numero = entrada.nextInt();

        if( numero > 0) {
            System.out.println(numero + " é positivo");
        } else {
            System.out.println(numero + " é negativo");
        }

        entrada.close();
    }
}
