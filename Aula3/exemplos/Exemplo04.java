package exemplos;

public class Exemplo04 {

    public static void main(String[] args) {
        String nome;

        nome = "Kelly";

        // comparação de textos (String)
        System.out.println( nome.equals( "kelly" ) );

        // não leva em consideração as maiúsculas/minúsculas
        System.out.println( nome.equalsIgnoreCase( "kelly" ) );

    }
}