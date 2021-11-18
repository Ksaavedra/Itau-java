package exercicios;

public class Exercicio01 {
   
    public static void main(String[] args) {
        // boolean resultado;

        // resultado = ehPar(10);

        if(ehPar(10)) {
            System.out.println("o número é par");
        } else {
            System.out.println("O número é impar");
        }
    }

    public static boolean ehPar(int numero) {
        if(numero % 2 == 0) {
            return true; // 1. para o método 2. devolve o resultado
        } 
        return false;
    }
}
