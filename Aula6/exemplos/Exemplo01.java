package exemplos;

public class Exemplo01 {
    
    public static void main(String[] args) {
        
        linha(); // chamada de método
        System.out.println("Meu programa.");
        linha();
        System.out.println("v.01");
        linha2(5);
        linha2(20);
        linha3(10, '*');
        linha3(30, '/');
        linha3(30, '=');

    }


    public static void linha() {
        System.out.println("--------------");
    }


    public static void linha2(int tamanho) {
        for(int i = 0; i < tamanho; i++) {
            System.out.print("-");
        }
        System.out.println(); // pula para próxima linha
    }

    public static void linha3(int tamanho, char simbolo) {
        for(int i = 0; i < tamanho; i++) {
            System.out.print(simbolo);
        }
        System.out.println(); // pula para próxima linha
    }
}
