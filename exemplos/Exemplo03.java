package exemplos;

import java.util.Scanner;

public class Exemplo03 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade;
        String nome;

        System.out.println("Digite o seu nome:");
        nome = entrada.nextLine(); // ler um texto do teclado

        System.out.println("Digite sua idade:");
        idade = entrada.nextInt(); // ler um valor inteiro do teclado

        System.out.println("Olá " + nome);
        System.out.println("Você tem " + idade + " anos.");

        entrada.close();
    }
}
