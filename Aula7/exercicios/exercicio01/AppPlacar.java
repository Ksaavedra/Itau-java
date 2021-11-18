package exercicios.exercicio01;

public class AppPlacar {
    public static void main(String[] args) {
        Placar placar1 = new Placar();
        Placar placar2 = new Placar("Santos", "Marilia AC");
        Placar placar3 = new Placar("XV de Jacu", "Piracicaba", 2, 1);

        System.out.println(placar1);
        System.out.println(placar2);
        System.out.println(placar3);
        
    }
}
