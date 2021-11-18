package exercicios.exercicio03;

public class AppVeiculo {
    public static void main(String[] args) {
        Veiculo v = new Veiculo("VW", "Gol", 12.5);

        
        // v.consumo = -10;
        v.setConsumo(-10);
        
        v.exibir();
        System.out.println("Consumo: " + v.getConsumo());
    }
}
