

import java.util.Scanner;

public class Exercicio03 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, cont;

        System.out.println("Informe o limite");
        numero = entrada.nextInt();

        cont= 1;
        while(cont <= numero) {
            System.out.printf("%d", cont);
            cont = cont * 2;

            if(cont <= numero) {
                System.out.println(", ");
            }
        }

        System.out.println();

        // solução 2

        System.out.println(1);
        cont = 2;
        while (cont <= numero){
            System.out.printf(", %d", cont);
            cont = cont * 2;
        }

        entrada.close();

    }
}
