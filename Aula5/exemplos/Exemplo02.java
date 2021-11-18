import javax.print.attribute.standard.NumberUp;

public class Exemplo02 {
    
    public static void main(String[] args) {
        
        int[] numeros = new int[5];

        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = (i + 1);
        }

        for(int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + " ");
        }
    }
}
