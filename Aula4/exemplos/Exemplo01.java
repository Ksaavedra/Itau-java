

public class Exemplo01 {
    public static void main(String[] args) {
        
        // System.out.println("teste 1"); //ln = new line, nova linha
        // System.out.println("teste 2");
        // System.out.println("teste 3");

        // printf = print formatado
        // printf ( FORMATO , VALORES  );
        
        // FORMATO: 
        // %d = número inteiro
        // %f = número decimal
        // %s = string = texto
        // \n = pula linha

        // %.2f = .2 = 2 casas decimais

        int idade = 23;
        System.out.printf("você tem %d anos.\n", idade); 

        double peso = 78.4567;
        System.out.printf("você pesa %f kilos.\n", peso);

        System.out.printf("você pesa %.2f kilos.\n", peso);

        System.out.printf("você tem %d anos.\nvocê pesa %.2f kilos.\n", idade, peso);

        double media = 34.6123;
        System.out.printf("MEDIA = %.1f\n", media);
    }
}