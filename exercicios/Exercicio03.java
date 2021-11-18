package exercicios;

import java.util.Scanner;

public class Exercicio03 {  
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double salarioAtual, nSalario;

        //Entrada de dados
        System.out.println("Informe o salario atual: ");
        salarioAtual = entrada.nextInt(); // ler um valor interiro do teclado

        // Processamento
        nSalario = (salarioAtual * 0.25) + salarioAtual;

        // Saída de dados
        System.out.println("O novo salario R$: " + nSalario);

        entrada.close();
    }

}
