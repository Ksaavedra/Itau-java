

public class Exemplo02 {
    public static void main(String[] args) {
        int cont;

        cont = 1;

        while(cont < 10) {
            System.out.println(cont);
            //cont = cont + 1;

            cont ++;
        }

        while(cont <= 10) {
            System.out.println(cont);
            //cont = cont + 1;

            cont ++;
        }

        while(cont < 11) {
            System.out.println(cont);
            //cont = cont + 1;

            cont ++;
        }

        System.out.println("Final =" + cont);

    }
}