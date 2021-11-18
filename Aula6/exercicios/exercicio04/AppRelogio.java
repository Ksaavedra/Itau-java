package exercicios.exercicio04;

public class AppRelogio {
    public static void main(String[] args) {
        Relogio relogio = new Relogio(2, -10, 20);

        relogio.exibir();

        
        relogio.setHora(92); // não aceita valor inválido

        System.out.println("Hora = " + relogio.getHora());
        System.out.println("Minuto = " + relogio.getMinuto());
        System.out.println("Segundo = " + relogio.getSegundo());
    }
}
