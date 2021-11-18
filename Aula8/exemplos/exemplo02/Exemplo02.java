package exemplos.exemplo02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo02 {
   
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        String entrada;

        try {
            // System.out.println("Digite um número:");
            // numero = teclado.nextInt();

            System.out.println("Digite outro número:");
            entrada = teclado.nextLine();
            numero = Integer.parseInt(entrada);


        } catch (InputMismatchException ex) { // quandp a digitação no nextInt() for incorreto
            System.out.println("Erro na entrada de dados.");
           
        } catch (NumberFormatException ex ) { // quando a tranformação no parseTnt() foi incorreto 
           System.out.println("Erro de conversão...");
           System.out.println(ex.getMessage());
           ex.printStackTrace();

        } catch (Exception ex) {
            System.out.println("Erro...");

        } finally {
            System.out.println("Você digitou " + numero);
            teclado.close();
        }

        
    }
}
