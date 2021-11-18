package exercicios;

import java.util.Scanner;

public class Exercicio02 {  
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, media;

        //Entrada de dados
        System.out.println("Nota 1: ");
        nota1 = entrada.nextInt(); // ler um valor interiro do teclado

        System.out.println("Nota 2: ");
        nota2 = entrada.nextInt(); // ler um valor interiro do teclado

        // Processamento
        media = (nota1 + nota2) / 2;

        // Saída de dados
        System.out.println("A nota média é: " + media);

        entrada.close();
    }
}