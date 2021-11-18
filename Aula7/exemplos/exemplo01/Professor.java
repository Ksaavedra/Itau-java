package exemplos.exemplo01;

public class Professor extends Pessoa {
    private double salario;

    public Professor(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }

    public Professor(String nome) {
        super(nome);
        this.salario = 0;
    }

    public double getSalario() {
        return salario;
    }
}
