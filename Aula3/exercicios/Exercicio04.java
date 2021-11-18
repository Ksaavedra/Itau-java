package exercicios;

import java.util.Scanner;

public class Exercicio03 {  
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double salarioBru, valorPrestacao, limite;

        //Entrada de dados
        System.out.println("Informe o valor do salário bruto: ");
        salarioBru = entrada.nextInt(); // ler um valor interiro do teclado

        System.out.println("Informe o valor da prestação: ");
        valorPrestacao= entrada.nextInt(); // ler um valor interiro do teclado

        // Processamento
        limite = (salarioBru * 0.3);// 30% do salário bruto

        if(valorPrestacao <= limite) {
            System.out.println("Pode fazer o empréstimo.");

        }else {
            System.out.println("Não pode fazer o empréstimo");
        }
        
        entrada.close();
    }

}
