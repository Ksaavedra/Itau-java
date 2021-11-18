package exemplos;

public class Exemplo03 {
    
    public static void main(String[] args) {
        
        // i += 2; 
        // i = i + 2;

        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println();
        
        int i = 2;
        while(i <= 100) {
            System.out.print(i + " ");
            i += 2;
        }
    }
}
