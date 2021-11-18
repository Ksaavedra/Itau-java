package uri;

import java.util.Scanner;

public class Exercicio1006 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double a, b, c, media;

        a = entrada.nextDouble();
        b = entrada.nextDouble();
        c = entrada.nextDouble();

        media = ((a * 2) + (b * 3) + (c * 5)) /10;

        System.out.printf("MEDIA = " + media);

        entrada.close();
    }
}
