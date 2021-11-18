

import java.util.Scanner;

public class Exercicio04 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, cont, soma;

        numero = 1;
        cont = 1;
        soma = 0;

        while(numero != 0) {
            System.out.printf("Digite o %dº núemro inteiro", cont);
            soma = soma + numero;
            cont ++;
        }

        System.out.println("Soma = " + soma);
        entrada.close();
    }   
}
