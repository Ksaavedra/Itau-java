package exercicios.exercicio03;

public class Veiculo {
    private String marca, modelo;
    private double consumo;

    public Veiculo(String marca, String modelo, double consumo) {
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
    }

    public void exibir() {
        System.out.printf("marca: %s modelo: %s\n", marca, modelo);
    }

    // obterConsumo
    public double getConsumo() {
        return consumo;
    }

    // alterarConsumo
    public void setConsumo(double consumo) {
        if(consumo > 0) {
            this.consumo = consumo;
        }
    }
}
