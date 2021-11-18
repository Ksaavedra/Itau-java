package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioMin, valorPorKW, valorTotal, valorComDesconto;
        int qtdeKWConsumida;

        // Entrada
        System.out.println("Informe o valor do salario mínimo:");
        salarioMin = entrada.nextDouble();
        System.out.println("Informa a quantidade de KW consumida:");
        qtdeKWConsumida = entrada.nextInt();

        // Processamento
        valorPorKW = salarioMin / 500;
        valorTotal = valorPorKW * qtdeKWConsumida;
        valorComDesconto = valorTotal * 0.85;

        //Saída
        System.out.println("Valor por KW: " + valorPorKW);
        System.out.println("Valor Total: " + valorTotal);
        System.out.println("Valor com desconto: " + valorComDesconto);
        
        entrada.close();
    }
}
