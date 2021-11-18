package exemplos;

public class Exemplo01 {
    public static void main(String[] args) {
        // int cont;

        for(int cont = 1; cont < 11; cont++) { // 'cont' é LOCAL neste bloco
            System.out.println(cont);
        }

        // System.out.println("Final: " + cont); // 'cont' não é reconhecida

    }
}