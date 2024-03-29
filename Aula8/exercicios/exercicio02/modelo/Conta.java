package exercicios.exercicio02.modelo;

// abstract = esta classe é um modelo para outras classes
// mas não criaremos objetos deste tipo
public class Conta { 
    private int numero;
    private double saldo;

    public Conta(int numero){
        this.numero = numero;
        this.saldo = 0;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean depositar(double valor) {
        if(valor > 0) {
            saldo += valor; // saldo = saldo + valor
            return true;
        }
        return false;
    }

    public boolean sacar(double valor) {
        if(valor > 0) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return numero + " saldo: " + saldo;
    }
}