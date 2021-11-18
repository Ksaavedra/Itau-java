package exemplos;

public class Exemplo02 {
    
    public static void main(String[] args) {
        int retorno;

        retorno = soma(10, 8);

        System.out.println("Soma = " + retorno);
    }


    public static int soma(int n1, int n2) {
        int resultado;

        resultado = n1 + n2;

        return resultado; // "devolva" o valor da variável 'resultado'
    }
}
