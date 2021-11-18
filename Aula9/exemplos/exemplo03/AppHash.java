package exemplos.exemplo03;

import java.util.HashMap;

public class AppHash {
    public static void main(String[] args) {
        // HashMap<Tipo de Chave, Tipo de Dados>
        HashMap<Integer, String> mapa = new HashMap<>();

        mapa.put(1, "Um");
        mapa.put(2, "Dois");
        mapa.put(3, "Três");
        mapa.put(4, "Quatro");

        System.out.println( mapa.get(3) );
        System.out.println( mapa.get(5) );
    }
}
