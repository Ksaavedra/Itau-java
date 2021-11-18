package uri;

import java.util.Scanner;

public class Exercicio1035 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();
        int d = entrada.nextInt();

        boolean variavelN = b > c && d > a && (c + d) > (a + b) && c >= 0 && d >= 0 && a % 2 == 0;

        if(variavelN) {
            System.out.println("Valores aceitos");
        }else {
            System.out.println("Valores nao aceitos");
        }

        entrada.close();
    }
}
