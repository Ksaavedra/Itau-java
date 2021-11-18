package exemplos.exemplo01;

import java.util.ArrayList;

public class AppArray {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(12);
        lista.add(78);
        lista.add(987);
        lista.add(3);

        // lista.add(2, 11);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println( lista.get(i) ); // 0, 1, 2, 3, 4, ....
        }

        System.out.println();

        for (Integer elemento : lista) { // para cada "elemento" da "lista" faça
            System.out.println(elemento);
        }
    }
}