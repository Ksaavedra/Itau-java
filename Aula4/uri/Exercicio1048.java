
import java.util.Scanner;

public class Exercicio1048 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario = entrada.nextDouble();   
        double reajuste = 0;
        int percentual;
        
        if (salario > 0 && salario <= 400) {
            reajuste = salario * 0.15;
            percentual = 15;

        } else if (salario <= 800) {
            reajuste = salario * 0.12;
            percentual = 12;

        } else if (salario <= 1200) {
            reajuste = salario * 0.10;
            percentual = 10;

        } else if (salario <= 2000) {
            reajuste = salario * 0.07;
            percentual = 7;
            
        } else {
            reajuste = salario * 0.04;
            percentual = 4;
        }
        
        System.out.printf("Novo salario: %.2f\n", (salario + reajuste));
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.println("Em percentual: " + percentual + "%");
        
        entrada.close();
    }
}