import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String[] nomes = new String[7];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o nome da pessoas: ");
            nomes[i] = entrada.nextLine();
        }
    
        System.out.println("Em orgem: ");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i] + " ");
        }

        System.out.println("\nAo contrário");
        for (int i = nomes.length -1; i >= 0; i--) {
            System.out.println(nomes[i] + " ");
        }

        entrada.close();
    }
}
